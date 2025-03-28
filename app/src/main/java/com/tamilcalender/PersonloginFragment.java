package com.tamilcalender;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.VideoView;

import org.jetbrains.annotations.Nullable;


public class PersonloginFragment extends Fragment {

    private EditText urlEditText;
    private Button downloadButton;
    private VideoView videoView;
    private long downloadId;
    private DownloadManager downloadManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_personlogin, container, false);

        urlEditText = view.findViewById(R.id.urlEditText);
        downloadButton = view.findViewById(R.id.downloadButton);
        videoView = view.findViewById(R.id.videoView);

        downloadButton.setOnClickListener(v -> {
            String videoUrl = urlEditText.getText().toString().trim();
            if (!videoUrl.isEmpty()) {
                downloadVideo(videoUrl);
            } else {
                Toast.makeText(getContext(), "Please enter a valid URL", Toast.LENGTH_SHORT).show();
            }
        });

        downloadManager = (DownloadManager) requireContext().getSystemService(Context.DOWNLOAD_SERVICE);

        return view;
    }

    private void downloadVideo(String videoUrl) {
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(videoUrl));
        request.setTitle("Downloading video");
        request.setDescription("Please wait...");
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "downloaded_video.mp4");

        if (downloadManager != null) {
            downloadId = downloadManager.enqueue(request);
            Toast.makeText(getContext(), "Download started", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getContext(), "Download manager not available", Toast.LENGTH_SHORT).show();
        }
    }

    private void playDownloadedVideo() {
        String videoPath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + "/downloaded_video.mp4";
        Uri videoUri = Uri.parse(videoPath);
        videoView.setVideoURI(videoUri);
        videoView.setOnPreparedListener(mp -> videoView.start());
        videoView.setOnCompletionListener(mp -> Toast.makeText(getContext(), "Video playback completed", Toast.LENGTH_SHORT).show());
    }


}