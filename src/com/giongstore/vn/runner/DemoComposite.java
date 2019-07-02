package com.giongstore.vn.runner;

import com.giongstore.vn.structural.Category;

import java.util.Calendar;

public class DemoComposite {
    public static void main(String[] args) {
        Category danh_muc_san_pham = new Category("Danh muc san pham", 0);

        Category thoi_trang = new Category("Thoi trang", 0);
        Category phu_kien = new Category("Phu kien", 0);
        Category do_choi = new Category("Do choi", 0);

        Category thoi_trang_nu = new Category("Thoi trang nu", 64237);
        Category thoi_trang_nam = new Category("Thoi trang nam", 44015);
        Category vali_balo_tuixach = new Category("Va li - Ba lo - Tui xach", 34813);
        Category phu_kien_thoi_trang = new Category("Phu kien thoi trang", 50685);

        Category trang_phuc_nam = new Category("Trang phuc nam", 44240);
        Category tuixach_vinam = new Category("Tui xach, vi nam", 250);
        Category giay_dep_nam = new Category("Giay, dep nam", 10733);
        Category phu_kien_nam = new Category("Phu kien nam", 6847);

        Category ao_thun_nam = new Category("Ao thun nam", 11754);
        Category ao_somi_nam = new Category("Ao so mi nam", 4045);
        Category ao_khoac_nam = new Category("Ao khoac nam", 1673);
        Category quan_nam = new Category("Quan nam", 3722);

        danh_muc_san_pham.add(thoi_trang);
        danh_muc_san_pham.add(phu_kien);
        danh_muc_san_pham.add(do_choi);

        thoi_trang.add(thoi_trang_nu);
        thoi_trang.add(thoi_trang_nam);
        thoi_trang.add(vali_balo_tuixach);
        thoi_trang.add(phu_kien_thoi_trang);

        thoi_trang_nam.add(trang_phuc_nam);
        thoi_trang_nam.add(tuixach_vinam);
        thoi_trang_nam.add(giay_dep_nam);
        thoi_trang_nam.add(phu_kien_nam);

        trang_phuc_nam.add(ao_thun_nam);
        trang_phuc_nam.add(ao_somi_nam);
        trang_phuc_nam.add(ao_khoac_nam);
        trang_phuc_nam.add(quan_nam);

        System.out.println(danh_muc_san_pham);
        printAll(danh_muc_san_pham, "");

    }

    public static void printAll(Category category, String alignment) {
        alignment += "\t";
        for(Category subCategory : category.getSubCategories()){
            System.out.println(alignment + subCategory);
            if(subCategory.getSubCategories().size() > 0) {
                printAll(subCategory, alignment);
            }
        }
    }
}
