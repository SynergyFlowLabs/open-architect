package com.planner5d.library.activity.fragment.spaces.view;

import androidx.annotation.f1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
public abstract class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f136400c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f136401d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Integer f136402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f136403b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ d d(a aVar, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = null;
            }
            return aVar.c(num);
        }

        public static /* synthetic */ d k(a aVar, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = null;
            }
            return aVar.j(num);
        }

        @NotNull
        public final d a(@NotNull Function0<Unit> retry) {
            Intrinsics.checkNotNullParameter(retry, "retry");
            return new i(com.planner5d.library.f.s.Ob, com.planner5d.library.f.s.f169102f7, retry);
        }

        @NotNull
        public final d b(int i10, int i11) {
            return new h(Integer.valueOf((i11 * 100) / i10), new k3(com.planner5d.library.f.s.f169029c7, Integer.valueOf(i11), Integer.valueOf(i10)), com.planner5d.library.f.s.f169054d7);
        }

        @NotNull
        public final d c(@Nullable Integer num) {
            return new k(num, com.planner5d.library.f.s.f169078e7, com.planner5d.library.f.s.f169054d7);
        }

        @NotNull
        public final d e(@NotNull Function0<Unit> download) {
            Intrinsics.checkNotNullParameter(download, "download");
            return new m(com.planner5d.library.f.s.f169004b7, com.planner5d.library.f.s.f168979a7, download);
        }

        @NotNull
        public final d f(int i10, @NotNull Function0<Unit> download) {
            Intrinsics.checkNotNullParameter(download, "download");
            return new l(new k3(com.planner5d.library.f.s.f169198j7, Integer.valueOf(i10)), com.planner5d.library.f.s.f168979a7, download);
        }

        @NotNull
        public final d g() {
            return new i(com.planner5d.library.f.s.f169246l7, com.planner5d.library.f.s.f169222k7, null);
        }

        @NotNull
        public final d h() {
            return new p();
        }

        @NotNull
        public final d i(@NotNull Function0<Unit> retry) {
            Intrinsics.checkNotNullParameter(retry, "retry");
            return new i(com.planner5d.library.f.s.f169126g7, com.planner5d.library.f.s.f169102f7, retry);
        }

        @NotNull
        public final d j(@Nullable Integer num) {
            return new k(num, com.planner5d.library.f.s.f169270m7, com.planner5d.library.f.s.f169054d7);
        }

        private a() {
        }
    }

    public /* synthetic */ d(Integer num, Integer num2, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2);
    }

    @Nullable
    public final Integer a() {
        return this.f136403b;
    }

    @Nullable
    public final Integer b() {
        return this.f136402a;
    }

    private d(@f1 Integer num, @f1 Integer num2) {
        this.f136402a = num;
        this.f136403b = num2;
    }
}
