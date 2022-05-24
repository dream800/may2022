package com.dream.repository;

 import com.dream.model.Banner;
 import org.springframework.data.jpa.repository.JpaRepository;


//@Reposit
public interface BannerRepository extends JpaRepository<Banner, Long> {
    Banner findOneById(Long id);

    Banner findOneByName(String name);
}
