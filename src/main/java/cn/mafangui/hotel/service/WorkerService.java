package cn.mafangui.hotel.service;

import cn.mafangui.hotel.entity.Worker;

import java.util.List;

public interface WorkerService {
    int insert(Worker worker);
    int delete(int workerId);
    int updateById(Worker worker);
    Worker selectById(int workerId);
    List<Worker> findAll();
    List<Worker> selectByRole(String role);
    Worker login(String username,String password);
}
