package com.tunehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tunehub.entities.Playlist;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Integer>
{

}
