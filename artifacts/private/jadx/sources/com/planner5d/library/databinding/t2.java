package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.planner5d.library.widget.VirtualJoystickView;
import com.planner5d.library.widget.editor.history.EditorHistoryButtons;
import com.planner5d.library.widget.editor.itemactionsbar.ItemActionsBar;
import com.planner5d.library.widget.editor.menu.EditorFloorsView;
import com.planner5d.library.widget.editor.propertiesbar.PropertiesBarView;
import com.planner5d.library.widget.editor.toolbar.EditorSubmenu;
import com.planner5d.library.widget.editor.toolbar.EditorToolbar;
import com.planner5d.library.widget.preloader.PreloaderAnimationView;
import com.planner5d.library.widget.preloader.PreloaderCoverView;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class t2 implements b4.b {

    @NonNull
    public final ButtonTextView H1;

    @NonNull
    public final PreloaderCoverView X;

    @NonNull
    public final TextView Y;

    @NonNull
    public final PropertiesBarView Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f159670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f159671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Group f159672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f159673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f159674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final FrameLayout f159675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f159676g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NonNull
    public final ImageView f159677g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f159678h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NonNull
    public final Group f159679h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f159680i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NonNull
    public final Group f159681i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final FrameLayout f159682j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @NonNull
    public final TextView f159683j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final EditorFloorsView f159684k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @NonNull
    public final ImageView f159685k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final EditorHistoryButtons f159686l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final EditorSubmenu f159687m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final EditorToolbar f159688n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final ItemActionsBar f159689o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final TextView f159690p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NonNull
    public final TextView f159691p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NonNull
    public final TextView f159692p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final VirtualJoystickView f159693s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final VirtualJoystickView f159694t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final ViewStub f159695v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    public final PreloaderAnimationView f159696w;

    private t2(@NonNull View view, @NonNull FrameLayout frameLayout, @NonNull Group group, @NonNull CircularProgressIndicator circularProgressIndicator, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull ButtonTextView buttonTextView, @NonNull ButtonTextView buttonTextView2, @NonNull ButtonTextView buttonTextView3, @NonNull FrameLayout frameLayout4, @NonNull EditorFloorsView editorFloorsView, @NonNull EditorHistoryButtons editorHistoryButtons, @NonNull EditorSubmenu editorSubmenu, @NonNull EditorToolbar editorToolbar, @NonNull ItemActionsBar itemActionsBar, @NonNull VirtualJoystickView virtualJoystickView, @NonNull VirtualJoystickView virtualJoystickView2, @NonNull ViewStub viewStub, @NonNull PreloaderAnimationView preloaderAnimationView, @NonNull PreloaderCoverView preloaderCoverView, @NonNull TextView textView, @NonNull PropertiesBarView propertiesBarView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ButtonTextView buttonTextView4, @NonNull TextView textView4, @NonNull ImageView imageView, @NonNull Group group2, @NonNull Group group3, @NonNull TextView textView5, @NonNull ImageView imageView2) {
        this.f159670a = view;
        this.f159671b = frameLayout;
        this.f159672c = group;
        this.f159673d = circularProgressIndicator;
        this.f159674e = frameLayout2;
        this.f159675f = frameLayout3;
        this.f159676g = buttonTextView;
        this.f159678h = buttonTextView2;
        this.f159680i = buttonTextView3;
        this.f159682j = frameLayout4;
        this.f159684k = editorFloorsView;
        this.f159686l = editorHistoryButtons;
        this.f159687m = editorSubmenu;
        this.f159688n = editorToolbar;
        this.f159689o = itemActionsBar;
        this.f159693s = virtualJoystickView;
        this.f159694t = virtualJoystickView2;
        this.f159695v = viewStub;
        this.f159696w = preloaderAnimationView;
        this.X = preloaderCoverView;
        this.Y = textView;
        this.Z = propertiesBarView;
        this.f159690p0 = textView2;
        this.f159691p1 = textView3;
        this.H1 = buttonTextView4;
        this.f159692p2 = textView4;
        this.f159677g3 = imageView;
        this.f159679h3 = group2;
        this.f159681i3 = group3;
        this.f159683j3 = textView5;
        this.f159685k3 = imageView2;
    }

    @NonNull
    public static t2 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.R1;
        FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
        if (frameLayout != null) {
            i10 = com.planner5d.library.f.j.S1;
            Group group = (Group) b4.c.a(view, i10);
            if (group != null) {
                i10 = com.planner5d.library.f.j.T1;
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) b4.c.a(view, i10);
                if (circularProgressIndicator != null) {
                    i10 = com.planner5d.library.f.j.V3;
                    FrameLayout frameLayout2 = (FrameLayout) b4.c.a(view, i10);
                    if (frameLayout2 != null) {
                        i10 = com.planner5d.library.f.j.E4;
                        FrameLayout frameLayout3 = (FrameLayout) b4.c.a(view, i10);
                        if (frameLayout3 != null) {
                            i10 = com.planner5d.library.f.j.f167934a5;
                            ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
                            if (buttonTextView != null) {
                                i10 = com.planner5d.library.f.j.f167984c5;
                                ButtonTextView buttonTextView2 = (ButtonTextView) b4.c.a(view, i10);
                                if (buttonTextView2 != null) {
                                    i10 = com.planner5d.library.f.j.f168279ob;
                                    ButtonTextView buttonTextView3 = (ButtonTextView) b4.c.a(view, i10);
                                    if (buttonTextView3 != null) {
                                        i10 = com.planner5d.library.f.j.Bb;
                                        FrameLayout frameLayout4 = (FrameLayout) b4.c.a(view, i10);
                                        if (frameLayout4 != null) {
                                            i10 = com.planner5d.library.f.j.Cb;
                                            EditorFloorsView editorFloorsView = (EditorFloorsView) b4.c.a(view, i10);
                                            if (editorFloorsView != null) {
                                                i10 = com.planner5d.library.f.j.f168351rb;
                                                EditorHistoryButtons editorHistoryButtons = (EditorHistoryButtons) b4.c.a(view, i10);
                                                if (editorHistoryButtons != null) {
                                                    i10 = com.planner5d.library.f.j.f168400tb;
                                                    EditorSubmenu editorSubmenu = (EditorSubmenu) b4.c.a(view, i10);
                                                    if (editorSubmenu != null) {
                                                        i10 = com.planner5d.library.f.j.f168424ub;
                                                        EditorToolbar editorToolbar = (EditorToolbar) b4.c.a(view, i10);
                                                        if (editorToolbar != null) {
                                                            i10 = com.planner5d.library.f.j.f168380sf;
                                                            ItemActionsBar itemActionsBar = (ItemActionsBar) b4.c.a(view, i10);
                                                            if (itemActionsBar != null) {
                                                                i10 = com.planner5d.library.f.j.Pf;
                                                                VirtualJoystickView virtualJoystickView = (VirtualJoystickView) b4.c.a(view, i10);
                                                                if (virtualJoystickView != null) {
                                                                    i10 = com.planner5d.library.f.j.Qf;
                                                                    VirtualJoystickView virtualJoystickView2 = (VirtualJoystickView) b4.c.a(view, i10);
                                                                    if (virtualJoystickView2 != null) {
                                                                        i10 = com.planner5d.library.f.j.f168049el;
                                                                        ViewStub viewStub = (ViewStub) b4.c.a(view, i10);
                                                                        if (viewStub != null) {
                                                                            i10 = com.planner5d.library.f.j.f168144il;
                                                                            PreloaderAnimationView preloaderAnimationView = (PreloaderAnimationView) b4.c.a(view, i10);
                                                                            if (preloaderAnimationView != null) {
                                                                                i10 = com.planner5d.library.f.j.f168361rl;
                                                                                PreloaderCoverView preloaderCoverView = (PreloaderCoverView) b4.c.a(view, i10);
                                                                                if (preloaderCoverView != null) {
                                                                                    i10 = com.planner5d.library.f.j.mo;
                                                                                    TextView textView = (TextView) b4.c.a(view, i10);
                                                                                    if (textView != null) {
                                                                                        i10 = com.planner5d.library.f.j.xo;
                                                                                        PropertiesBarView propertiesBarView = (PropertiesBarView) b4.c.a(view, i10);
                                                                                        if (propertiesBarView != null) {
                                                                                            i10 = com.planner5d.library.f.j.tv;
                                                                                            TextView textView2 = (TextView) b4.c.a(view, i10);
                                                                                            if (textView2 != null) {
                                                                                                i10 = com.planner5d.library.f.j.Aw;
                                                                                                TextView textView3 = (TextView) b4.c.a(view, i10);
                                                                                                if (textView3 != null) {
                                                                                                    i10 = com.planner5d.library.f.j.Dw;
                                                                                                    ButtonTextView buttonTextView4 = (ButtonTextView) b4.c.a(view, i10);
                                                                                                    if (buttonTextView4 != null) {
                                                                                                        i10 = com.planner5d.library.f.j.Ew;
                                                                                                        TextView textView4 = (TextView) b4.c.a(view, i10);
                                                                                                        if (textView4 != null) {
                                                                                                            i10 = com.planner5d.library.f.j.Fw;
                                                                                                            ImageView imageView = (ImageView) b4.c.a(view, i10);
                                                                                                            if (imageView != null) {
                                                                                                                i10 = com.planner5d.library.f.j.Gw;
                                                                                                                Group group2 = (Group) b4.c.a(view, i10);
                                                                                                                if (group2 != null) {
                                                                                                                    i10 = com.planner5d.library.f.j.Hw;
                                                                                                                    Group group3 = (Group) b4.c.a(view, i10);
                                                                                                                    if (group3 != null) {
                                                                                                                        i10 = com.planner5d.library.f.j.Iw;
                                                                                                                        TextView textView5 = (TextView) b4.c.a(view, i10);
                                                                                                                        if (textView5 != null) {
                                                                                                                            i10 = com.planner5d.library.f.j.Jw;
                                                                                                                            ImageView imageView2 = (ImageView) b4.c.a(view, i10);
                                                                                                                            if (imageView2 != null) {
                                                                                                                                return new t2(view, frameLayout, group, circularProgressIndicator, frameLayout2, frameLayout3, buttonTextView, buttonTextView2, buttonTextView3, frameLayout4, editorFloorsView, editorHistoryButtons, editorSubmenu, editorToolbar, itemActionsBar, virtualJoystickView, virtualJoystickView2, viewStub, preloaderAnimationView, preloaderCoverView, textView, propertiesBarView, textView2, textView3, buttonTextView4, textView4, imageView, group2, group3, textView5, imageView2);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static t2 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.f.m.T2, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f159670a;
    }
}
