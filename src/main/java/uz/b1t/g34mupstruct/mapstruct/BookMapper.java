package uz.b1t.g34mupstruct.mapstruct;

import org.mapstruct.Condition;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.util.StringUtils;
import uz.b1t.g34mupstruct.domain.Book;
import uz.b1t.g34mupstruct.dto.BookDTO;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {

    @Mapping( target = "title", conditionExpression = "java(checkForLowercase(book))")
    BookDTO toDTO(Book book);


    default boolean checkForLowercase(Book book){
        boolean isLower = false;
        for (char c : book.getTitle().toCharArray()) {
            if (Character.isLowerCase(c)){
                return true;
            }
        }
        return false;
    }

    List<BookDTO> toBookDTOList(List<Book> books);

}
