package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f49035a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f49036b = 1;

    @androidx.annotation.w0(21)
    static class a {
        private a() {
        }

        static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        static void c(ViewGroup viewGroup, boolean z10) {
            viewGroup.setTransitionGroup(z10);
        }
    }

    private z1() {
    }

    @androidx.annotation.v0(expression = "group.getLayoutMode()")
    @Deprecated
    public static int a(@NonNull ViewGroup viewGroup) {
        return viewGroup.getLayoutMode();
    }

    public static int b(@NonNull ViewGroup viewGroup) {
        return a.a(viewGroup);
    }

    public static boolean c(@NonNull ViewGroup viewGroup) {
        return a.b(viewGroup);
    }

    @androidx.annotation.v0(expression = "group.onRequestSendAccessibilityEvent(child, event)")
    @Deprecated
    public static boolean d(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    @androidx.annotation.v0(expression = "group.setLayoutMode(mode)")
    @Deprecated
    public static void e(@NonNull ViewGroup viewGroup, int i10) {
        viewGroup.setLayoutMode(i10);
    }

    @androidx.annotation.v0(expression = "group.setMotionEventSplittingEnabled(split)")
    @Deprecated
    public static void f(ViewGroup viewGroup, boolean z10) {
        viewGroup.setMotionEventSplittingEnabled(z10);
    }

    public static void g(@NonNull ViewGroup viewGroup, boolean z10) {
        a.c(viewGroup, z10);
    }
}
