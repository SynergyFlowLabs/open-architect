package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nOnBackPressedCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,105:1\n1855#2,2:106\n*S KotlinDebug\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n*L\n60#1:106,2\n*E\n"})
public abstract class i0 {

    @NotNull
    private final CopyOnWriteArrayList<e> cancellables = new CopyOnWriteArrayList<>();

    @Nullable
    private Function0<Unit> enabledChangedCallback;
    private boolean isEnabled;

    public i0(boolean z10) {
        this.isEnabled = z10;
    }

    @oj.i(name = "addCancellable")
    public final void addCancellable(@NotNull e cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    @Nullable
    public final Function0<Unit> getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    @androidx.annotation.l0
    public void handleOnBackCancelled() {
    }

    @androidx.annotation.l0
    public abstract void handleOnBackPressed();

    @androidx.annotation.l0
    public void handleOnBackProgressed(@NotNull d backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    @androidx.annotation.l0
    public void handleOnBackStarted(@NotNull d backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    @androidx.annotation.l0
    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @androidx.annotation.l0
    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((e) it.next()).cancel();
        }
    }

    @oj.i(name = "removeCancellable")
    public final void removeCancellable(@NotNull e cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }

    @androidx.annotation.l0
    public final void setEnabled(boolean z10) {
        this.isEnabled = z10;
        Function0<Unit> function0 = this.enabledChangedCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(@Nullable Function0<Unit> function0) {
        this.enabledChangedCallback = function0;
    }
}
