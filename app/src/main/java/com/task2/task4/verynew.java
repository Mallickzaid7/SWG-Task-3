package com.task2.task4;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import com.task2.task4.ui.main.SectionsPagerAdapter;
import com.task2.task4.databinding.ActivityVerynewBinding;

public class verynew extends AppCompatActivity {

    private ActivityVerynewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityVerynewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = binding.fab;

            }
            public void btn1(View view){
                Intent link1 = new Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://drive.google.com/folderview?id=1xJn5vlX6mZ5Z-6q7u_huQ74YR4Z9xKk5"));
                startActivity(link1);
            }
    public void btnn2(View view){
        Intent link2 = new Intent(Intent.ACTION_VIEW,android.net.Uri.parse("https://drive.google.com/folderview?id=1Ilkqo4ACbSZcm7sjhIU4Mzo2aDCKWA0A"));
        startActivity(link2);
    }public void btn3(View view){
        Intent link3 = new Intent(Intent.ACTION_VIEW,android.net.Uri.parse("https://drive.google.com/folderview?id=17-qeV4Umwvhu8mU0lxXHymLjZxnQb9CZ"));
        startActivity(link3);
    }public void btn4(View view){
        Intent link4 = new Intent(Intent.ACTION_VIEW,android.net.Uri.parse("https://drive.google.com/folderview?id=1-_dcVwdSOQlb6FCJutPET8njbQLlMHpq"));
        startActivity(link4);
    }public void btn5(View view){
        Intent link5 = new Intent(Intent.ACTION_VIEW,android.net.Uri.parse("https://drive.google.com/folderview?id=1Igrrq58ilumLDdHZrmEHzqW5o_YVisfg"));
        startActivity(link5);
    }public void btn6(View view){
        Intent link6 = new Intent(Intent.ACTION_VIEW,android.net.Uri.parse("https://drive.google.com/folderview?id=1LKCznjBAg1Kt1k49n7GDHJy31R0SIAPq"));
        startActivity(link6);
    }
    public void btn7(View view){
        Intent link7 = new Intent(Intent.ACTION_VIEW,android.net.Uri.parse("https://drive.google.com/folderview?id=1pn-AFOBpcb0sHw6_zaqNKlXQepEVGVpy"));
        startActivity(link7);
    }
    public void btn8(View view){
        Intent link8 = new Intent(Intent.ACTION_VIEW,android.net.Uri.parse("https://drive.google.com/folderview?id=1-ba39v86vbamXlXq-ROn9cSkGNIAttHA"));
        startActivity(link8);
    }
    public void btn9(View view){
        Intent link9 = new Intent(Intent.ACTION_VIEW,android.net.Uri.parse("https://drive.google.com/folderview?id=1_zg0V0-atJCDd1p6GUA5lkLUZHctAhG-"));
        startActivity(link9);
    }
    public void btn10(View view){
        Intent link10 = new Intent(Intent.ACTION_VIEW,android.net.Uri.parse("https://drive.google.com/folderview?id=1G-fcHUD8CXWjw5nBBchABKVIR3MYxK1c"));
        startActivity(link10);
    }
    public void btn11(View view){
        Intent link11 = new Intent(Intent.ACTION_VIEW,android.net.Uri.parse("https://drive.google.com/folderview?id=1-_dcVwdSOQlb6FCJutPET8njbQLlMHpq"));
        startActivity(link11);
    }





        }

