package com.planner5d.library.widget.editor.popup.floors.view;

import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.d0;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.widget.ImageButtonWithStates;
import com.planner5d.library.widget.menu.p;
import com.planner5d.library.widget.menu.s;
import com.planner5d.library.widget.textview.TextViewWithStates;
import com.planner5d.library.widget.w1;
import fj.h;

/* JADX INFO: loaded from: classes8.dex */
public class g extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextViewWithStates f257232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @h
    private final View f257233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ImageButtonWithStates f257234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ImageButtonWithStates f257235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f257236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ItemFloor f257237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f257238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f257239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f257240i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f257241j;

    public interface a {
        void a(ItemFloor itemFloor);

        void b(ItemFloor itemFloor);

        void c(ItemFloor itemFloor);

        void d(ItemFloor itemFloor, int i10, int i11);

        void e(ItemFloor itemFloor);

        void f(ItemFloor itemFloor);
    }

    public g(Context context, boolean z10) {
        super(context);
        this.f257236e = null;
        this.f257237f = null;
        this.f257238g = false;
        this.f257239h = false;
        this.f257240i = false;
        View.inflate(context, com.planner5d.library.f.m.f168689f7, this);
        this.f257241j = z10;
        TextViewWithStates textViewWithStates = (TextViewWithStates) findViewById(com.planner5d.library.f.j.Kc);
        this.f257232a = textViewWithStates;
        View viewFindViewById = findViewById(com.planner5d.library.f.j.Bv);
        this.f257233b = viewFindViewById;
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.popup.floors.view.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f257226a.f(view);
            }
        });
        textViewWithStates.setOnDrawableStateChangedListener(new TextViewWithStates.a() { // from class: com.planner5d.library.widget.editor.popup.floors.view.c
            @Override // com.planner5d.library.widget.textview.TextViewWithStates.a
            public final void a() {
                this.f257227a.j();
            }
        });
        ImageButtonWithStates imageButtonWithStates = (ImageButtonWithStates) findViewById(com.planner5d.library.f.j.f168345r5);
        this.f257234c = imageButtonWithStates;
        ImageButtonWithStates imageButtonWithStates2 = (ImageButtonWithStates) findViewById(com.planner5d.library.f.j.f168017dd);
        this.f257235d = imageButtonWithStates2;
        if (!z10) {
            setOnDrawableStateForButton(imageButtonWithStates);
            com.planner5d.library.widget.drawable.c cVar = com.planner5d.library.widget.drawable.c.f254258a;
            imageButtonWithStates.setImageDrawable(cVar.a(getContext(), com.planner5d.library.f.h.f167875x9, Integer.valueOf(androidx.core.content.d.g(getContext(), com.planner5d.library.f.C1549f.G5))));
            imageButtonWithStates.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.popup.floors.view.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f257228a.h(view);
                }
            });
            imageButtonWithStates2.setImageDrawable(cVar.a(getContext(), com.planner5d.library.f.h.S7, Integer.valueOf(androidx.core.content.d.g(getContext(), com.planner5d.library.f.C1549f.f166753vh))));
            return;
        }
        imageButtonWithStates.setVisibility(8);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textViewWithStates.getLayoutParams();
        marginLayoutParams.setMarginStart(context.getResources().getDimensionPixelSize(com.planner5d.library.f.g.Lh));
        textViewWithStates.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
        marginLayoutParams2.setMarginEnd(0);
        viewFindViewById.setLayoutParams(marginLayoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        if (this.f257240i) {
            return;
        }
        setActive(true);
        a aVar = this.f257236e;
        if (aVar != null) {
            aVar.f(this.f257237f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(Activity activity, MenuItem menuItem) {
        if (this.f257236e != null) {
            int itemId = menuItem.getItemId();
            if (itemId == com.planner5d.library.f.j.f168221m1) {
                this.f257236e.c(this.f257237f);
            } else if (itemId == com.planner5d.library.f.j.R0) {
                this.f257236e.e(this.f257237f);
            } else if (itemId == com.planner5d.library.f.j.f168173k1) {
                this.f257236e.a(this.f257237f);
            }
        }
    }

    private int getDefaultColor() {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        s sVar = new s(new ContextThemeWrapper(getContext(), com.planner5d.library.f.t.f170114v7), view, com.planner5d.library.f.n.f168920m, com.planner5d.library.f.C1549f.Mh, new p() { // from class: com.planner5d.library.widget.editor.popup.floors.view.e
            @Override // com.planner5d.library.widget.menu.p
            public final void a(Activity activity, MenuItem menuItem) {
                this.f257229a.g(activity, menuItem);
            }
        });
        sVar.b(getContext(), com.planner5d.library.f.j.f168221m1, com.planner5d.library.f.h.U9);
        sVar.b(getContext(), com.planner5d.library.f.j.R0, com.planner5d.library.f.h.G7).setVisible(this.f257238g);
        sVar.b(getContext(), com.planner5d.library.f.j.f168173k1, com.planner5d.library.f.h.M6).setVisible(this.f257239h);
        sVar.setGravity(d0.f48644c);
        sVar.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(ImageButtonWithStates imageButtonWithStates) {
        boolean zA = w1.f258867a.a(imageButtonWithStates);
        k(imageButtonWithStates, zA ? androidx.core.content.d.g(getContext(), com.planner5d.library.f.C1549f.f166427i2) : getDefaultColor(), zA ? -1 : androidx.core.content.d.g(getContext(), com.planner5d.library.f.C1549f.G5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        boolean zA = w1.f258867a.a(this.f257232a);
        int iG = zA ? -1 : androidx.core.content.d.g(getContext(), com.planner5d.library.f.C1549f.f166273bi);
        int iG2 = zA ? androidx.core.content.d.g(getContext(), com.planner5d.library.f.C1549f.f166437ic) : getDefaultColor();
        this.f257232a.setTextColor(iG);
        View view = this.f257233b;
        if (view != null) {
            view.setBackgroundColor(iG2);
        }
        k(this.f257235d, iG2, zA ? -1 : androidx.core.content.d.g(getContext(), com.planner5d.library.f.C1549f.f166753vh));
        k(this.f257234c, iG2, zA ? -1 : androidx.core.content.d.g(getContext(), com.planner5d.library.f.C1549f.G5));
    }

    private void k(ImageButtonWithStates imageButtonWithStates, int i10, int i11) {
        imageButtonWithStates.setDrawableColor(Integer.valueOf(i11));
        imageButtonWithStates.setBackgroundColor(i10);
    }

    private void setActive(boolean z10) {
        this.f257240i = z10;
        j();
        findViewById(com.planner5d.library.f.j.Cr).setVisibility(z10 ? 0 : 8);
        invalidate();
    }

    private void setOnDrawableStateForButton(final ImageButtonWithStates imageButtonWithStates) {
        imageButtonWithStates.setOnDrawableStateChangedListener(new ImageButtonWithStates.a() { // from class: com.planner5d.library.widget.editor.popup.floors.view.f
            @Override // com.planner5d.library.widget.ImageButtonWithStates.a
            public final void a() {
                this.f257230a.i(imageButtonWithStates);
            }
        });
    }

    public g l(boolean z10, boolean z11) {
        this.f257238g = z10;
        this.f257239h = z11;
        return this;
    }

    public g m(ItemFloor itemFloor, boolean z10) {
        this.f257237f = itemFloor;
        this.f257232a.setText(itemFloor == null ? null : itemFloor.title);
        setActive(z10);
        return this;
    }

    public g n(a aVar) {
        this.f257236e = aVar;
        return this;
    }

    public void setGrabButtonVisibility(int i10) {
        ImageButtonWithStates imageButtonWithStates = this.f257235d;
        if (this.f257241j) {
            i10 = 8;
        }
        imageButtonWithStates.setVisibility(i10);
    }
}
