package uz.b1t.g34mupstruct.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.b1t.g34mupstruct.domain.Store;
import uz.b1t.g34mupstruct.repo.StoreRepository;
import uz.b1t.g34mupstruct.dto.StoreCreationDTO;
import uz.b1t.g34mupstruct.dto.StoreDTO;
import uz.b1t.g34mupstruct.mapstruct.StoreMapper;

@RestController
@RequestMapping("/store")
@RequiredArgsConstructor
public class StoreController {

    private final StoreRepository storeRepository;
    
    @PostMapping
    public StoreDTO saveStore(@RequestBody StoreCreationDTO storeCreationDTO){
        Store store = StoreMapper.INSTANCE.mapToEntity(storeCreationDTO);
        store = storeRepository.save(store);
        return StoreMapper.INSTANCE.mapToDTO(store);
    }
}
