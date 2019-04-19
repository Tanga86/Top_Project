package com.opportunity.dao;

import com.opportunity.dto.Mechanic;

import java.util.List;

public interface MechanicDao {
    List<Mechanic> getAll();
}
//Делать лучше через интерфейс ,для гибкости кода
