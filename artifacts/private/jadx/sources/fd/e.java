package fd;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public enum e {
    Default("default"),
    DesignGenerator("design_generator"),
    PlanRecognitions("plan_recognitions"),
    PremiumBenefits("premium_benefits"),
    PremiumGreen("premium_green"),
    PremiumGreenSquare("premium_green_square"),
    PremiumRecommendations("premium_recommendations"),
    PremiumReview("premium_review"),
    ProGreen("pro_green"),
    ProGreenSquare("pro_green_square"),
    PurchaseSnapshots("purchase_snapshots"),
    PurchaseTextures("purchase_textures"),
    Superwall("superwall"),
    None("none");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f275136a;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f275135v = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f275119b = new a(null);

    @SourceDebugExtension({"SMAP\nPaywallLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaywallLayout.kt\ncom/planner5d/library/model/payments/PaywallLayout$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,29:1\n295#2,2:30\n*S KotlinDebug\n*F\n+ 1 PaywallLayout.kt\ncom/planner5d/library/model/payments/PaywallLayout$Companion\n*L\n22#1:30,2\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final e a(@Nullable String str) {
            e next;
            Iterator<e> it = e.l().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.areEqual(next.n(), str)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        public final boolean b(@Nullable String str) {
            return a(str) == e.Superwall;
        }

        private a() {
        }
    }

    static {
        int i10 = 4 ^ 2;
    }

    e(String str) {
        this.f275136a = str;
    }

    @NotNull
    public static kotlin.enums.a<e> l() {
        return f275135v;
    }

    @NotNull
    public final String n() {
        return this.f275136a;
    }
}
