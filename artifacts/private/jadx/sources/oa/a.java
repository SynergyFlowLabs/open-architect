package oa;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.smartwizard.roomshape.i;
import jf.g;
import jf.h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class a implements jf.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f333595c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i f333596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final hf.c f333597b;

    /* JADX INFO: renamed from: oa.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2346a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f333598a;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.square.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.diamond.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.lType.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i.tetris.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[i.rectangle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[i.new_room.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[i.shovel.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f333598a = iArr;
        }
    }

    public a(@NotNull i shape, @NotNull hf.c builder) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f333596a = shape;
        this.f333597b = builder;
    }

    @Override // jf.e
    @NotNull
    public kf.b k() {
        jf.e gVar;
        switch (C2346a.f333598a[this.f333596a.ordinal()]) {
            case 1:
                gVar = new g(this.f333597b);
                break;
            case 2:
                gVar = new jf.a(this.f333597b);
                break;
            case 3:
                gVar = new jf.b(this.f333597b);
                break;
            case 4:
                gVar = new h(this.f333597b);
                break;
            case 5:
                gVar = new jf.d(this.f333597b);
                break;
            case 6:
                gVar = new jf.c(this.f333597b);
                break;
            case 7:
                gVar = new jf.f(this.f333597b);
                break;
            default:
                throw new k0();
        }
        return gVar.k();
    }
}
