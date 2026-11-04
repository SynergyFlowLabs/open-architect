package com.google.firebase.inappmessaging.display.internal;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes5.dex */
public class m extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f122465a = 120;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f122466b = 250;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f122467c = 200;

    public boolean a() {
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        if (Math.abs(motionEvent.getX() - motionEvent2.getX()) <= 250.0f && motionEvent.getY() - motionEvent2.getY() > 120.0f && Math.abs(f11) > 200.0f) {
            return a();
        }
        return false;
    }
}
