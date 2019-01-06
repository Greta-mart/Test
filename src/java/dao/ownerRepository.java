package dao;

import dao.entity.productOwner;

import java.util.List;

public interface ownerRepository {
    long create(productOwner productOwner);
    void update(productOwner productOwner);
    productOwner getOne(long id);
    List<productOwner> findAll();

}
