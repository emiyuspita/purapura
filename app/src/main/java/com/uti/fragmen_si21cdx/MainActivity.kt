package com.uti.fragmen_si21cdx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        dekralasi variabel "binding
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        buka "fragment1"
        supportFragmentManager.beginTransaction().replace(R.id.frm_content, Menu1Fragment()).commit()

//        buka "fragment1"
//        supportFragmentManager.beginTransaction().replace(R.id.frm_content, Menu2Fragment()).commit()

//        buat event untuk menu1
        binding.btnMenu1.setOnclickListener{
            supportFragmentManager.beginTransaction().replace(R.id.frm_content, Menu1Fragment()).commit()
        }
//        buat event untuk menu2
        binding.btnMenu2.setOnclickListener{
            supportFragmentManager.beginTransaction().replace(R.id.frm_content, Menu1Fragment()).commit()
        }

//        buat event menu3
        binding.btnMenu1.setOnclickListener{
            supportFragmentManager.beginTransaction().replace(R.id.frm_content, Menu1Fragment()).commit()
        }

//        buat variabel fragment
        val fragment = menu3Fragment()
//        buat variabel bundle
        val bundle = Bundle()
//        isi variabel bundle
        Bundle.putString("tombl", "kembali")
        bundle.putInt("nilai", 100)
//        kirim variabel bandel ke fragment
        fragment.arguments = bundle

//        deklarasi variabel binding
        val binding = FargmrntMenu3Binding.inflate(inflater, container, false)

        binding.btnkembali.text = argument?.getString("tpmbol")


        binding.btnkembali.text = argument?.getInt("nilai").getInt



        return binding.root
    }
}