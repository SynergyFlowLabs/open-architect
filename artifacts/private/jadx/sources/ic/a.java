package ic;

import com.planner5d.library.feed.data.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension({"SMAP\nSelectDesignOfTheDayDataWindowUseCaseInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectDesignOfTheDayDataWindowUseCaseInteractor.kt\ncom/planner5d/library/feed/interactor/SelectDesignOfTheDayDataWindowUseCaseInteractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,26:1\n785#2:27\n796#2:28\n1872#2,2:29\n797#2,2:31\n1874#2:33\n799#2:34\n*S KotlinDebug\n*F\n+ 1 SelectDesignOfTheDayDataWindowUseCaseInteractor.kt\ncom/planner5d/library/feed/interactor/SelectDesignOfTheDayDataWindowUseCaseInteractor\n*L\n15#1:27\n15#1:28\n15#1:29,2\n15#1:31,2\n15#1:33\n15#1:34\n*E\n"})
public final class a implements com.planner5d.library.feed.usecase.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C1925a f287069d = new C1925a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f287070e = 10;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f287071f = 70;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final d f287072c;

    /* JADX INFO: renamed from: ic.a$a, reason: collision with other inner class name */
    public static final class C1925a {
        public /* synthetic */ C1925a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1925a() {
        }
    }

    @ij.a
    public a(@NotNull d dayProvider) {
        Intrinsics.checkNotNullParameter(dayProvider, "dayProvider");
        this.f287072c = dayProvider;
    }

    @Override // com.planner5d.library.feed.usecase.b
    @NotNull
    public <T> List<T> a(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        int iA = this.f287072c.a();
        IntRange intRangeW1 = r.W1(iA * 10, (iA + 1) * 10);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (T t10 : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (intRangeW1.t(i10)) {
                arrayList.add(t10);
            }
            i10 = i11;
        }
        return arrayList;
    }
}
