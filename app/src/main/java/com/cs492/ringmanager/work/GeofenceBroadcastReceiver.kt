package com.cs492.ringmanager.work

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.AudioManager
import com.cs492.ringmanager.RingManagerApplication.Companion.SILENCE_GEOFENCE_EVENT

class GeofenceBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if(intent.action == SILENCE_GEOFENCE_EVENT){
            val audiomanager = context.getSystemService(Context.AUDIO_SERVICE) as AudioManager
            audiomanager.ringerMode = AudioManager.RINGER_MODE_SILENT
        }
    }
}