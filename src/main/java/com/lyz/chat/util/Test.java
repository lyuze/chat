package com.lyz.chat.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Model> accept = new ArrayList<>();
        accept.add(new Model(0, 20));
        accept.add(new Model(30, 50));
        accept.add(new Model(50, 70));
        accept.add(new Model(80, 90));
        accept.add(new Model(100, 120));
        accept.add(new Model(20, 30));
        boolean decision = decision(accept);
        System.out.println(decision);
    }
    private static boolean decision(List<Model> accept){
        List<Model> list = new ArrayList<>();
        int size = accept.size();
        isTrue(accept, list);
        int size1 = list.size();
        if (size == size1){
            return true;
        }else {
            return false;
        }
    }

    private static void isTrue(List<Model> accept, List<Model> list) {
        if (list == null || list.size() == 0){
            // 第一次进入 将接受到的第一个加入到判断集合中
            list.add(accept.get(0));
            accept.remove(accept.get(0));
            isTrue(accept, list);
        }else {
            // 不是第一次进入  取出第一个
            boolean flag = true;
            Model m = accept.get(0);
            for (Model model : list) {
                // 判断
                if (m.getMin() >= model.getMax() || m.getMax() <= model.getMin()){
                    // 成立的
                    flag = true;
                    continue;
                }else {
                    // 不成立
                    flag = false;
                    break;
                }
            }
            if (flag){
                list.add(m);
                accept.remove(m);
                if (accept.size() > 0){
                    isTrue(accept, list);
                }
            }else {
                return;
            }
        }
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class Model{
        private Integer min;

        private Integer max;
    }
}
