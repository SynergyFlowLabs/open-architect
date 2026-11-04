package kotlin.sequences;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.e1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f313055a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f313056b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f313057c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f313058d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f313059e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f313060f = 5;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SequenceBuilder.kt\nkotlin/sequences/SequencesKt__SequenceBuilderKt\n*L\n1#1,22:1\n26#2:23\n*E\n"})
    public static final class a<T> implements Sequence<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f313061a;

        public a(Function2 function2) {
            this.f313061a = function2;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            return p.a(this.f313061a);
        }
    }

    @e1(version = "1.3")
    @NotNull
    public static <T> Iterator<T> a(@kotlin.b @NotNull Function2<? super n<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        m mVar = new m();
        mVar.j(kotlin.coroutines.intrinsics.b.c(block, mVar, mVar));
        return mVar;
    }

    @e1(version = "1.3")
    @NotNull
    public static <T> Sequence<T> b(@kotlin.b @NotNull Function2<? super n<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new a(block);
    }
}
