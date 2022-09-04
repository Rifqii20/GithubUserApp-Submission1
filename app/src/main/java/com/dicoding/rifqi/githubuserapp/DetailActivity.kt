package com.dicoding.rifqi.githubuserapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.rifqi.githubuserapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = intent.getParcelableExtra<User>(EXTRA_USER) as User
        binding.cvProfile.setImageResource(user.avatar)
        binding.apply {
            tvItemName.text = user.name
            tvItemUsername.text = user.username
            tvFollowing.text = "Following \n${user.following}"
            tvItemFollowers.text = "Followers \n${user.followers}"
            tvItemRepo.text = "Repository \n${user.repository}"
            tvItemCompany.text = "Company : ${user.company}"
            tvItemLocation.text = user.location
        }

        binding.btnShare.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val share: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, binding.tvItemUsername.text.toString())
            type = "text/plain"
        }
        startActivity(share)
    }

    companion object {
        const val EXTRA_USER = "extra_user"
    }
}