package in.eshwar.repository;

import org.springframework.data.repository.CrudRepository;

import in.eshwar.entity.PlayerEntity;

public interface PlayerRepository extends CrudRepository<PlayerEntity, Integer> {

}
