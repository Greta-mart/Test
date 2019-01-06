package dao.impl;

import dao.entity.productOwner;
import dao.ownerRepository;

import java.util.List;

public class ownerRepositoryImpl implements ownerRepository {
    @Override
    public long create(productOwner productOwner) {
        return 0;
    }

    @Override
    public void update(productOwner productOwner) {

    }

    @Override
    public productOwner getOne(long id) {
        return null;
    }

    @Override
    public List<productOwner> findAll() {
        return null;
    }
}
