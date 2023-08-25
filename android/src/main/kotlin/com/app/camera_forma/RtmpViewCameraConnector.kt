package com.app.camera_forma

import android.app.Activity
import android.util.Size

// FEHMİ KAPATTI import net.ossrs.rtmp.ConnectCheckerRtmp
// FEHMİ EKLEDİ
import com.pedro.rtmp.utils.ConnectCheckerRtmp
// FEHMİ KAPATTI import net.ossrs.rtmp.SrsFlvMuxer
import com.pedro.rtmp.rtmp.RtmpClient

class RtmpViewCameraConnector(val activity: Activity,
                              val connectChecker: ConnectCheckerRtmp) {

    private val srsFlvMuxer: RtmpClient = RtmpClient(connectChecker)

    var isStreaming = false
        private set
    var isRecording = false
        private set

    companion object {
        private val TAG: String? = "RtmpCameraConnector"
    }


}