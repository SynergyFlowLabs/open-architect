package com.devtodev.core.utils;

import com.devtodev.core.utils.log.CoreLog;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f98345a = "com.devtodev.core.utils.b";

    public enum a {
        check_su_binary(new String[]{"/system/xbin/which", androidx.media3.exoplayer.upstream.f.f65986z});


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String[] f98348a;

        a(String[] strArr) {
            this.f98348a = strArr;
        }
    }

    b() {
    }

    ArrayList<String> a(a aVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Process processExec = Runtime.getRuntime().exec(aVar.f98348a);
            new BufferedWriter(new OutputStreamWriter(processExec.getOutputStream()));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    CoreLog.d(f98345a, "--> Line received: " + line);
                    arrayList.add(line);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            CoreLog.d(f98345a, "--> Full response was: " + arrayList);
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }
}
