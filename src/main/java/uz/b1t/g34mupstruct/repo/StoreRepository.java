package uz.b1t.g34mupstruct.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.b1t.g34mupstruct.domain.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
}