package com.planner5d.library.activity.fragment.smartwizard.roomshape;

import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class l extends RecyclerView.g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f135646b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ImageView f135647a;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f135648a;

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
                iArr[i.tetris.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i.rectangle.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[i.new_room.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[i.shovel.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[i.lType.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f135648a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull ImageView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.f135647a = view;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(com.planner5d.library.f.g.Lh);
        view.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(h hVar, i iVar, View view) {
        hVar.onItemClick(iVar);
    }

    public final void h(@NotNull final i shape, boolean z10, @NotNull final h clickListener) {
        int i10;
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.f135647a.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.smartwizard.roomshape.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.i(clickListener, shape, view);
            }
        });
        ImageView imageView = this.f135647a;
        switch (a.f135648a[shape.ordinal()]) {
            case 1:
                i10 = com.planner5d.library.f.h.Ah;
                break;
            case 2:
                i10 = com.planner5d.library.f.h.f167845vh;
                break;
            case 3:
                i10 = com.planner5d.library.f.h.Bh;
                break;
            case 4:
                i10 = com.planner5d.library.f.h.f167902yh;
                break;
            case 5:
                i10 = com.planner5d.library.f.h.f167883xh;
                break;
            case 6:
                i10 = com.planner5d.library.f.h.f167921zh;
                break;
            case 7:
                i10 = com.planner5d.library.f.h.f167864wh;
                break;
            default:
                throw new k0();
        }
        imageView.setImageResource(i10);
        ImageView imageView2 = this.f135647a;
        imageView2.setBackground(androidx.core.content.d.l(imageView2.getContext(), z10 ? com.planner5d.library.f.h.A3 : com.planner5d.library.f.h.B3));
    }
}
