package com.example.tienda.services;

import com.example.tienda.models.proveedoresModel;
import com.example.tienda.repositories.UIproveedores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class proveedoresService {
    @Autowired
    UIproveedores UIproveedores;

    //Create or update
    public void saveOrUpdate(proveedoresModel proveedoresModel) {
        UIproveedores.save(proveedoresModel);
    }
    // Read all records
    public List<proveedoresModel> getProveedores() {
        return UIproveedores.findAll();
    }
    // Read one record by id
    public Optional<proveedoresModel> getProveedor(Long id) {
        return UIproveedores.findById(id);
    }
    // Delete
    public void deleteProveedor(Long id) {
        UIproveedores.deleteById(id);
    }
}
