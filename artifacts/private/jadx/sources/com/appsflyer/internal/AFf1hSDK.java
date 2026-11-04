package com.appsflyer.internal;

import android.content.Context;
import android.os.Process;
import androidx.annotation.m1;
import com.appsflyer.AFLogger;
import com.devtodev.analytics.internal.domain.events.autoPurchases.AutoPurchaseKt;
import com.devtodev.core.data.metrics.MetricConsts;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AFf1hSDK {
    private static AFf1hSDK getMonetizationNetwork;
    private final Map<String, String> getCurrencyIso4217Code = new HashMap<String, String>() { // from class: com.appsflyer.internal.AFf1hSDK.1
        {
            put("aa", "ro.arch");
            put("ab", "ro.chipname");
            put("ac", "ro.dalvik.vm.native.bridge");
            put("ad", "persist.sys.nativebridge");
            put("ae", "ro.enable.native.bridge.exec");
            put("af", "dalvik.vm.isa.x86.features");
            put(MetricConsts.Age, "dalvik.vm.isa.x86.variant");
            put("ah", "ro.zygote");
            put(MetricConsts.ApplicationInfo, "ro.allow.mock.location");
            put("aj", "ro.dalvik.vm.isa.arm");
            put("ak", "dalvik.vm.isa.arm.features");
            put("al", "dalvik.vm.isa.arm.variant");
            put("am", "dalvik.vm.isa.arm64.features");
            put("an", "dalvik.vm.isa.arm64.variant");
            put("ao", "vzw.os.rooted");
            put(AutoPurchaseKt.AUTO_PURCHASE_CODE, "ro.build.user");
            put("aq", "ro.kernel.qemu");
            put("ar", "ro.hardware");
            put("as", "ro.product.cpu.abi");
            put("at", "ro.product.cpu.abilist");
            put("au", "ro.product.cpu.abilist32");
            put(androidx.media3.exoplayer.upstream.h.f66000n, "ro.product.cpu.abilist64");
        }
    };

    enum AFa1uSDK {
        XPOSED("xps"),
        FRIDA("frd");

        String getRevenue;

        AFa1uSDK(String str) {
            this.getRevenue = str;
        }
    }

    enum AFa1vSDK {
        HOOKING("hk"),
        DEBUGGABLE("dbg");

        String AFAdRevenueData;

        AFa1vSDK(String str) {
            this.AFAdRevenueData = str;
        }
    }

    private AFf1hSDK() {
    }

    private AFg1dSDK AFAdRevenueData(Context context) {
        AFg1dSDK aFg1dSDK = new AFg1dSDK();
        try {
            aFg1dSDK.getCurrencyIso4217Code(AFa1vSDK.HOOKING.AFAdRevenueData, getRevenue());
            aFg1dSDK.getCurrencyIso4217Code(AFa1vSDK.DEBUGGABLE.AFAdRevenueData, Boolean.valueOf(getMonetizationNetwork(context)));
            return aFg1dSDK;
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("failed to perform analysis checks", th2);
            return aFg1dSDK;
        }
    }

    @m1
    public static AFf1hSDK getMediationNetwork() {
        if (getMonetizationNetwork == null) {
            getMonetizationNetwork = new AFf1hSDK();
        }
        return getMonetizationNetwork;
    }

    private static boolean getMonetizationNetwork(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    private static String getRevenue() {
        StringBuilder sb2 = new StringBuilder();
        try {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            int i10 = 0;
            int i11 = 0;
            while (it.hasNext()) {
                for (StackTraceElement stackTraceElement : it.next().getValue()) {
                    if (stackTraceElement.toString().contains("de.robv.android.xposed") && i11 <= 2) {
                        i11++;
                        sb2.append(AFa1uSDK.XPOSED.getRevenue);
                        if (stackTraceElement.getMethodName().equals(io.sentry.protocol.b0.b.f306153h)) {
                            sb2.append("+a");
                        }
                        if (stackTraceElement.getMethodName().equals("handleHookedMethod")) {
                            sb2.append("+h");
                        }
                        sb2.append(";");
                    }
                    if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit")) {
                        i10++;
                    }
                }
            }
            if (i10 > 1) {
                sb2.append("mz;");
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("hooking check error", th2);
        }
        try {
            StringBuilder sb3 = new StringBuilder("/proc/");
            sb3.append(Process.myPid());
            sb3.append("/maps");
            if (getRevenue(sb3.toString(), "frida")) {
                sb2.append(AFa1uSDK.FRIDA.getRevenue);
            }
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("frida detection error", e10);
            sb2.append(e10.getMessage().toLowerCase(Locale.getDefault()));
        }
        sb2.append(";");
        return sb2.toString();
    }

    public final Object getCurrencyIso4217Code(Context context, String str) throws Throwable {
        String str2 = null;
        if (str != null) {
            try {
                str2 = getMediationNetwork(str) ? null : "invalid timestamp";
            } catch (Exception e10) {
                AFLogger.afErrorLogForExcManagerOnly("could not get anti fraud data", e10);
                return str2;
            }
        }
        AFg1dSDK aFg1dSDK = new AFg1dSDK();
        aFg1dSDK.getCurrencyIso4217Code("pr", AFAdRevenueData());
        aFg1dSDK.getCurrencyIso4217Code("an", AFAdRevenueData(context));
        return aFg1dSDK;
    }

    @e.a({"PrivateApi"})
    private static String getMonetizationNetwork(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("error in props rfl", e10);
            return null;
        }
    }

    private static boolean getMediationNetwork(String str) {
        return str.matches("\\d+");
    }

    private AFg1dSDK AFAdRevenueData() throws Throwable {
        AFg1dSDK aFg1dSDK = new AFg1dSDK();
        try {
            for (Map.Entry<String, String> entry : this.getCurrencyIso4217Code.entrySet()) {
                String monetizationNetwork = getMonetizationNetwork(entry.getValue());
                if (monetizationNetwork != null && !monetizationNetwork.equals("")) {
                    aFg1dSDK.getCurrencyIso4217Code(entry.getKey(), monetizationNetwork);
                }
            }
            return aFg1dSDK;
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("failed to create props", e10);
            return aFg1dSDK;
        }
    }

    private static boolean getRevenue(String str, String str2) throws Exception {
        String line;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, Charset.defaultCharset()));
            String lowerCase = str2.toLowerCase(Locale.getDefault());
            do {
                line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    fileInputStream.close();
                    return false;
                }
            } while (!new HashSet(Arrays.asList(line.toLowerCase(Locale.getDefault()).split("[\\s.,\\]\\-:/_\\[]"))).contains(lowerCase));
            bufferedReader.close();
            fileInputStream.close();
            return true;
        } catch (FileNotFoundException e10) {
            AFLogger.afErrorLogForExcManagerOnly("FNF", e10);
            throw new Exception("FNF");
        } catch (IOException e11) {
            AFLogger.afErrorLogForExcManagerOnly("IOF", e11);
            throw new Exception("IOF");
        } catch (Exception e12) {
            AFLogger.afErrorLogForExcManagerOnly("GF", e12);
            throw new Exception("GF");
        }
    }
}
