package com.google.android.play.core.install;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.play.core.appupdate.internal.s;
import e7.d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class InstallState {
    public static InstallState f(@d int i10, long j10, long j11, @e7.c int i11, @NonNull String str) {
        return new c(i10, j10, j11, i11, str);
    }

    public static InstallState g(@NonNull Intent intent, @NonNull s sVar) {
        sVar.a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        sVar.a("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
        sVar.a("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
        return new c(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
    }

    public abstract long a();

    @e7.c
    public abstract int b();

    @d
    public abstract int c();

    public abstract String d();

    public abstract long e();
}
