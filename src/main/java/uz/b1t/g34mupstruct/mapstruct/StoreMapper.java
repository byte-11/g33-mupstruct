package uz.b1t.g34mupstruct.mapstruct;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import uz.b1t.g34mupstruct.domain.Store;
import uz.b1t.g34mupstruct.dto.StoreCreationDTO;
import uz.b1t.g34mupstruct.dto.StoreDTO;

@Mapper(componentModel = "spring", uses = {BookMapper.class})
public interface StoreMapper {
    
    StoreMapper INSTANCE = Mappers.getMapper(StoreMapper.class);

    @Mapping(source = "description" , target = "info")
    @Mapping(source = "id" , target = "storeId")
    @Mapping(target = "books" , expression = "java(uz.b1t.g34mupstruct.mapstruct.BookMapper.INSTANCE.toBookDTOList(store.books))")
    StoreDTO mapToDTO(Store store);

    @InheritInverseConfiguration
    Store mapToEntity(StoreDTO storeDTO);

    Store mapToEntity(StoreCreationDTO storeCreationDTO);
}
