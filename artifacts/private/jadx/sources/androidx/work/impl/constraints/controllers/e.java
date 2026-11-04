package androidx.work.impl.constraints.controllers;

import androidx.work.v;
import androidx.work.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends c<androidx.work.impl.constraints.c> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f76769c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f76770d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f76771b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        String strI = v.i("NetworkMeteredCtrlr");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f76770d = strI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull androidx.work.impl.constraints.trackers.h<androidx.work.impl.constraints.c> tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f76771b = 7;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public int b() {
        return this.f76771b;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public boolean d(@NotNull androidx.work.impl.model.v workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f76992j.d() == w.METERED;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean f(@NotNull androidx.work.impl.constraints.c value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (value.g() && value.h()) ? false : true;
    }
}
