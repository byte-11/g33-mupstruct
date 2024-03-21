package uz.b1t.g34mupstruct.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class StoreDTO {
    private Long storeId;

    private String name;

    private String info;

    private List<BookDTO> books;
}
