package sages.bootcamp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sages.bootcamp.dao.*;

/**
 * Created by lary8 on 04.07.2017.
 */
@Service
public class TaskService {
    @Autowired
    TaskDao taskDao;
    @Autowired
    PartDao partDao;
    @Autowired
    OrderDao orderDao;

    @Autowired
    EmploeeDao emploeeDao;
    @Autowired
    CustomerDao customerDao;
}
