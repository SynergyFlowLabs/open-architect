package androidx.compose.foundation.pager;

import androidx.compose.runtime.k7;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f18186a = a.f18187a;

    @SourceDebugExtension({"SMAP\nPagerSnapDistance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerSnapDistance.kt\nandroidx/compose/foundation/pager/PagerSnapDistance$Companion\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,111:1\n97#2,4:112\n*S KotlinDebug\n*F\n+ 1 PagerSnapDistance.kt\nandroidx/compose/foundation/pager/PagerSnapDistance$Companion\n*L\n59#1:112,4\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f18187a = new a();

        private a() {
        }

        @NotNull
        public final b1 a(int i10) {
            if (!(i10 >= 0)) {
                androidx.compose.foundation.internal.e.g("pages should be greater than or equal to 0. You have used " + i10 + '.');
            }
            return new d1(i10);
        }
    }

    int a(int i10, int i11, float f10, int i12, int i13);
}
