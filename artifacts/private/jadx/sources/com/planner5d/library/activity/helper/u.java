package com.planner5d.library.activity.helper;

import android.app.Activity;
import com.planner5d.library.services.utility.h3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f137125b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.managedfiles.a0 f137126a;

    static final class a implements androidx.lifecycle.d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f137127a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f137127a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f137127a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f137127a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof androidx.lifecycle.d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @ij.a
    public u(@NotNull com.planner5d.library.model.manager.managedfiles.a0 managedFileManager) {
        Intrinsics.checkNotNullParameter(managedFileManager, "managedFileManager");
        this.f137126a = managedFileManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Activity activity, com.planner5d.library.services.l.a aVar) {
        Intrinsics.checkNotNull(aVar);
        h3.k0(activity, aVar.a(), aVar.b());
        return Unit.f312394a;
    }

    @NotNull
    public final com.planner5d.library.model.manager.managedfiles.a0 b() {
        return this.f137126a;
    }

    public final void c(@NotNull final Activity activity, @NotNull androidx.lifecycle.o0 lifecycleOwner) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        com.planner5d.library.services.l.f224381g.k(lifecycleOwner, new a(new Function1() { // from class: com.planner5d.library.activity.helper.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.d(activity, (com.planner5d.library.services.l.a) obj);
            }
        }));
    }

    public final void e() {
        this.f137126a.e(true);
    }
}
