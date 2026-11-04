package com.planner5d.library.services.observable;

import com.planner5d.library.services.utility.r3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nReplayingObservable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplayingObservable.kt\ncom/planner5d/library/services/observable/ReplayingObservable\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n1863#2,2:33\n*S KotlinDebug\n*F\n+ 1 ReplayingObservable.kt\ncom/planner5d/library/services/observable/ReplayingObservable\n*L\n28#1:33,2\n*E\n"})
public final class d<T> implements a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private r3<T> f224490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<Function1<T, Unit>> f224491b = new ArrayList();

    public final void a(T t10) {
        List list;
        synchronized (this.f224491b) {
            try {
                this.f224490a = new r3<>(t10);
                list = CollectionsKt.toList(this.f224491b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(t10);
        }
    }

    @Override // com.planner5d.library.services.observable.a
    public void c(@NotNull Function1<? super T, Unit> observer) {
        r3<T> r3Var;
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.f224491b) {
            try {
                this.f224491b.add(observer);
                r3Var = this.f224490a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (r3Var != null) {
            observer.invoke(r3Var.a());
        }
    }
}
