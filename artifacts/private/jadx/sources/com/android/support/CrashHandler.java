package com.android.support;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes14.dex */
public final class CrashHandler {
    public static final Thread.UncaughtExceptionHandler DEFAULT_UNCAUGHT_EXCEPTION_HANDLER = Thread.getDefaultUncaughtExceptionHandler();

    public static void init(final Context app2, boolean overlayRequired) {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.android.support.CrashHandler.1
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable throwable) {
                Log.e("AppCrash", "Error just lunched ");
                try {
                    tryUncaughtException(thread, throwable);
                } catch (Throwable e10) {
                    e10.printStackTrace();
                    if (CrashHandler.DEFAULT_UNCAUGHT_EXCEPTION_HANDLER != null) {
                        CrashHandler.DEFAULT_UNCAUGHT_EXCEPTION_HANDLER.uncaughtException(thread, throwable);
                    } else {
                        System.exit(2);
                    }
                }
            }

            private void tryUncaughtException(Thread thread, Throwable throwable) {
                String dirName;
                Log.e("AppCrash", "Try saving log");
                String time = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss").format(new Date());
                String fileName = "mod_menu_crash_" + time + ".txt";
                if (Build.VERSION.SDK_INT >= 30) {
                    dirName = "/storage/emulated/0/Documents/";
                } else {
                    dirName = String.valueOf(app2.getExternalFilesDir(null));
                }
                File crashFile = new File(dirName, fileName);
                String versionName = "unknown";
                long versionCode = 0;
                try {
                    PackageInfo packageInfo = app2.getPackageManager().getPackageInfo(app2.getPackageName(), 0);
                    versionName = packageInfo.versionName;
                    versionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
                } catch (PackageManager.NameNotFoundException e10) {
                }
                StringWriter sw = new StringWriter();
                PrintWriter pw = new PrintWriter(sw);
                throwable.printStackTrace(pw);
                String fullStackTrace = sw.toString();
                pw.close();
                StringBuilder devInfo = new StringBuilder();
                devInfo.append("************* Crash Head ****************\n");
                devInfo.append("Time Of Crash      : ").append(time).append("\n");
                devInfo.append("Device Manufacturer: ").append(Build.MANUFACTURER).append("\n");
                devInfo.append("Device Model       : ").append(Build.MODEL).append("\n");
                devInfo.append("Android Version    : ").append(Build.VERSION.RELEASE).append("\n");
                devInfo.append("Android SDK        : ").append(Build.VERSION.SDK_INT).append("\n");
                devInfo.append("App VersionName    : ").append(versionName).append("\n");
                devInfo.append("App VersionCode    : ").append(versionCode).append("\n");
                devInfo.append("************* Crash Head ****************\n");
                devInfo.append("\n").append(fullStackTrace);
                String errorLog = devInfo.toString();
                try {
                    writeFile(crashFile, errorLog);
                } catch (IOException e11) {
                }
                Toast.makeText(app2, "Game has crashed unexpectedly", 1).show();
                Toast.makeText(app2, "Log saved to: " + String.valueOf(crashFile).replace("/storage/emulated/0/", ""), 1).show();
                Log.e("AppCrash", "Done");
                System.exit(2);
            }

            private void writeFile(File file, String content) throws IOException {
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
                file.createNewFile();
                FileOutputStream fos = new FileOutputStream(file);
                fos.write(content.getBytes());
                try {
                    fos.close();
                } catch (IOException e10) {
                }
            }
        });
    }
}
