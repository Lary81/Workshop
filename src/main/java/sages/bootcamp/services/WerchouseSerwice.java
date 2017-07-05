package sages.bootcamp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sages.bootcamp.dao.PartDao;

/**
 * Created by lary8 on 04.07.2017.
 */
@Service
public class WerchouseSerwice {
    @Autowired
    WerchouseDao werchouseDao;
    @Autowired
    PartDao partDao;
}
