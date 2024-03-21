package uz.b1t.g34mupstruct.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.b1t.g34mupstruct.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}