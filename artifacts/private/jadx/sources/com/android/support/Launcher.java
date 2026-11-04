package com.android.support;

import android.app.ActivityManager;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;

/* JADX INFO: loaded from: classes14.dex */
public class Launcher extends Service {
    Menu menu;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Menu menu = new Menu(this);
        this.menu = menu;
        menu.SetWindowManagerWindowService();
        this.menu.ShowMenu();
        final Handler handler = new Handler();
        handler.post(new Runnable() { // from class: com.android.support.Launcher.1
            @Override // java.lang.Runnable
            public void run() {
                Launcher.this.Thread();
                handler.postDelayed(this, 1000L);
            }
        });
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    private boolean isNotInGame() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance != 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Thread() {
        if (!isNotInGame()) {
            this.menu.setVisibility(0);
        } else {
            this.menu.setVisibility(4);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.menu.onDestroy();
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
        stopSelf();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return 2;
    }
}
