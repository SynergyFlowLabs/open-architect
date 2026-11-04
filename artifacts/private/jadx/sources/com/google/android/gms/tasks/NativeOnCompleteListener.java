package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class NativeOnCompleteListener implements OnCompleteListener<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f110973a;

    @g6.a
    public NativeOnCompleteListener(long j10) {
        this.f110973a = j10;
    }

    @g6.a
    public static void a(@NonNull Task<Object> task, long j10) {
        task.addOnCompleteListener(new NativeOnCompleteListener(j10));
    }

    @g6.a
    public native void nativeOnComplete(long j10, @androidx.annotation.p0 Object obj, boolean z10, boolean z11, @androidx.annotation.p0 String str);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    @g6.a
    public void onComplete(@NonNull Task<Object> task) {
        Object objQ;
        String message;
        Exception excP;
        if (task.u()) {
            objQ = task.q();
            message = null;
        } else if (task.s() || (excP = task.p()) == null) {
            objQ = null;
            message = null;
        } else {
            message = excP.getMessage();
            objQ = null;
        }
        nativeOnComplete(this.f110973a, objQ, task.u(), task.s(), message);
    }
}
