package com.megamusic.findshow.dao;

import com.megamusic.findshow.domain.entity.Artist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by maita on 17/8/14.
 */
public interface ArtistRepository extends JpaRepository<Artist,Long> {

    Artist findByIdAndIsDeleted(Long id,Integer isDeleted);
    Page<Artist> findByIsDeleted(Integer isDeleted,Pageable pageable);
    Page<Artist> findByCategoryIdAndIsDeleted(Long cateId,Integer isDeleted,Pageable pageable);

    Page<Artist> findByCityIdAndIsDeleted(Integer cityId,Integer isDeleted,Pageable pageable);
    Page<Artist> findByCityIdAndCategoryIdAndIsDeleted(Integer cityId,Long cateId,Integer isDeleted,Pageable pageable);


}
