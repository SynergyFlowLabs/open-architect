package com.planner5d.library.activity.fragment.dialog.purchase;

import androidx.annotation.f1;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.PurchasePageDesignGenerator;
import com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumGreen;
import com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumRecommendations;
import com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview;
import com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePageProGreenWithTrial;
import com.planner5d.library.activity.fragment.dialog.purchase.premium.square.PurchasePagePremiumGreenSquare;
import com.planner5d.library.activity.fragment.dialog.purchase.premium.square.PurchasePageProGreenSquareWithTrial;
import com.planner5d.library.activity.fragment.dialog.purchase.premiumold.PurchasePagePremiumBenefits;
import com.planner5d.library.activity.fragment.dialog.purchase.recognitions.PurchasePagePlanRecognitions;
import com.planner5d.library.activity.fragment.dialog.purchase.snapshots.PurchasePageSnapshots;
import com.planner5d.library.activity.fragment.dialog.purchase.textures.PurchasePageTextures;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f132525d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f132526e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<? extends Fragment> f132527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f132528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final fd.e f132529c;

    public static final class a {

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.dialog.purchase.d0$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1458a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f132530a;

            static {
                int[] iArr = new int[fd.e.values().length];
                try {
                    iArr[fd.e.PremiumReview.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[fd.e.Default.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    int i10 = 6 ^ 3;
                    iArr[fd.e.PremiumGreen.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[fd.e.PremiumRecommendations.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[fd.e.PremiumBenefits.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[fd.e.PurchaseSnapshots.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[fd.e.PurchaseTextures.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[fd.e.DesignGenerator.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[fd.e.ProGreen.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[fd.e.PlanRecognitions.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[fd.e.PremiumGreenSquare.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[fd.e.ProGreenSquare.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[fd.e.None.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[fd.e.Superwall.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                f132530a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final d0 a(@NotNull fd.e layout) {
            Intrinsics.checkNotNullParameter(layout, "layout");
            DefaultConstructorMarker defaultConstructorMarker = null;
            switch (C1458a.f132530a[layout.ordinal()]) {
                case 1:
                    return new d0(PurchasePagePremiumReview.class, com.planner5d.library.f.s.qu, layout, defaultConstructorMarker);
                case 2:
                case 3:
                    return new d0(PurchasePagePremiumGreen.class, com.planner5d.library.f.s.qu, layout, defaultConstructorMarker);
                case 4:
                    return new d0(PurchasePagePremiumRecommendations.class, com.planner5d.library.f.s.qu, layout, defaultConstructorMarker);
                case 5:
                    return new d0(PurchasePagePremiumBenefits.class, com.planner5d.library.f.s.qu, layout, defaultConstructorMarker);
                case 6:
                    return new d0(PurchasePageSnapshots.class, com.planner5d.library.f.s.MC, layout, defaultConstructorMarker);
                case 7:
                    return new d0(PurchasePageTextures.class, com.planner5d.library.f.s.zF, layout, defaultConstructorMarker);
                case 8:
                    return new d0(PurchasePageDesignGenerator.class, com.planner5d.library.f.s.bG, fd.e.DesignGenerator, defaultConstructorMarker);
                case 9:
                    return new d0(PurchasePageProGreenWithTrial.class, com.planner5d.library.f.s.Pu, layout, defaultConstructorMarker);
                case 10:
                    return new d0(PurchasePagePlanRecognitions.class, com.planner5d.library.f.s.Ov, layout, defaultConstructorMarker);
                case 11:
                    return new d0(PurchasePagePremiumGreenSquare.class, com.planner5d.library.f.s.qu, layout, defaultConstructorMarker);
                case 12:
                    return new d0(PurchasePageProGreenSquareWithTrial.class, com.planner5d.library.f.s.Pu, layout, defaultConstructorMarker);
                case 13:
                case 14:
                    throw new IllegalArgumentException();
                default:
                    throw new k0();
            }
        }

        private a() {
        }
    }

    public /* synthetic */ d0(Class cls, int i10, fd.e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, i10, eVar);
    }

    @NotNull
    public final fd.e a() {
        return this.f132529c;
    }

    @NotNull
    public final Class<? extends Fragment> b() {
        return this.f132527a;
    }

    public final int c() {
        return this.f132528b;
    }

    private d0(Class<? extends Fragment> cls, @f1 int i10, fd.e eVar) {
        this.f132527a = cls;
        this.f132528b = i10;
        this.f132529c = eVar;
    }
}
