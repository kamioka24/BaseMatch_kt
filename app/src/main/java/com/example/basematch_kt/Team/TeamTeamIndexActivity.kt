package com.example.basematch_kt.Team

import android.os.Bundle
import com.example.basematch_kt.Custom.CustomActivity
import com.example.basematch_kt.R
import kotlinx.android.synthetic.main.activity_team_team_index.*

class TeamTeamIndexActivity : CustomActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_team_index)

        teamTeamBackButton.setOnClickListener {
            backToTop()
        }
    }
}