package com.devtodev.analytics.internal.platform.repository.utils;

import android.os.Build;
import androidx.media3.exoplayer.upstream.f;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Root {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @SourceDebugExtension({"SMAP\nRoot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Root.kt\ncom/devtodev/analytics/internal/platform/repository/utils/Root$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean checkRootMethod1() {
            String str = Build.TAGS;
            return str != null && StringsKt.V2(str, "test-keys", false, 2, null);
        }

        private final boolean checkRootMethod2() {
            try {
                String[] strArr = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};
                for (int i10 = 0; i10 < 8; i10++) {
                    if (new File(strArr[i10]).exists()) {
                        return true;
                    }
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            return false;
        }

        private final boolean checkRootMethod3() {
            ArrayList arrayList = new ArrayList();
            try {
                Process processExec = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", f.f65986z});
                Intrinsics.checkNotNullExpressionValue(processExec, "{\n                Runtim…ch\", \"su\"))\n            }");
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                    while (true) {
                        String it = bufferedReader.readLine();
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        if (it == null) {
                            break;
                        }
                        arrayList.add(it);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        public final boolean isDeviceRooted() {
            try {
                if (!checkRootMethod1() && !checkRootMethod2() && !checkRootMethod3()) {
                    return false;
                }
                return true;
            } catch (Exception e10) {
                e10.printStackTrace();
                return false;
            }
        }

        private Companion() {
        }
    }
}
