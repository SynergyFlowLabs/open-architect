package com.android.support;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.Html;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.media3.common.x0;
import com.facebook.appevents.p;
import com.google.common.base.c;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import l1.a;

/* JADX INFO: loaded from: classes14.dex */
public class Menu {
    public static final String TAG = "Mod_Menu";
    Context getContext;
    LinearLayout mCollapse;
    RelativeLayout mCollapsed;
    LinearLayout mExpanded;
    RelativeLayout mRootContainer;
    LinearLayout mSettings;
    WindowManager mWindowManager;
    LinearLayout mods;
    LinearLayout mods2;
    boolean overlayRequired;
    private LinearLayout patches6;
    FrameLayout rootFrame;
    LinearLayout.LayoutParams scrlLL;
    LinearLayout.LayoutParams scrlLLExpanded;
    ScrollView scrollView;
    ImageView startimage;
    boolean stopChecking;
    WindowManager.LayoutParams vmParams;
    int TEXT_COLOR = Color.parseColor("#82CAFD");
    int TEXT_COLOR_2 = Color.parseColor("#FFFFFF");
    int BTN_COLOR = Color.parseColor("#1C262D");
    int MENU_BG_COLOR = Color.parseColor("#EE1C2A35");
    int MENU_FEATURE_BG_COLOR = Color.parseColor("#DD141C22");
    int MENU_WIDTH = 290;
    int MENU_HEIGHT = 210;
    int POS_X = 0;
    int POS_Y = 100;
    float MENU_CORNER = 4.0f;
    int ICON_SIZE = 0;
    float ICON_ALPHA = 0.7f;
    int ToggleON = -16711936;
    int ToggleOFF = a.f316127c;
    int BtnON = Color.parseColor("#1b5e20");
    int BtnOFF = Color.parseColor("#7f0000");
    int CategoryBG = Color.parseColor("#2F3D4C");
    int SeekBarColor = Color.parseColor("#80CBC4");
    int SeekBarProgressColor = Color.parseColor("#80CBC4");
    int CheckBoxColor = Color.parseColor("#80CBC4");
    int RadioColor = Color.parseColor("#FFFFFF");
    int CollapColor = Color.parseColor("#232F2C");
    String NumberTxtColor = "#41c300";

    native String[] GetFeatureList();

    native String Icon();

    native String IconWebViewData();

    native void Init(Context context, TextView textView, TextView textView2);

    native boolean IsGameLibLoaded();

    native String[] SettingsList();

    public Menu(Context context) {
        this.getContext = context;
        Preferences.context = context;
        FrameLayout frameLayout = new FrameLayout(context);
        this.rootFrame = frameLayout;
        frameLayout.setOnTouchListener(onTouchListener());
        this.mRootContainer = new RelativeLayout(context);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.mCollapsed = relativeLayout;
        relativeLayout.setVisibility(0);
        this.mCollapsed.setAlpha(this.ICON_ALPHA);
        LinearLayout outeroption2 = new LinearLayout(context);
        outeroption2.setLayoutParams(new LinearLayout.LayoutParams(-1, dp(200)));
        this.patches6 = new LinearLayout(context);
        LinearLayout linearLayout = new LinearLayout(context);
        this.mExpanded = linearLayout;
        linearLayout.setVisibility(8);
        this.mExpanded.setBackgroundColor(this.MENU_BG_COLOR);
        this.mExpanded.setOrientation(1);
        this.mExpanded.setLayoutParams(new LinearLayout.LayoutParams(dp(this.MENU_WIDTH), -2));
        GradientDrawable gdMenuBody = new GradientDrawable();
        gdMenuBody.setCornerRadius(this.MENU_CORNER);
        gdMenuBody.setColor(this.MENU_BG_COLOR);
        gdMenuBody.setStroke(1, Color.parseColor("#32cb00"));
        ImageView imageView = new ImageView(context);
        this.startimage = imageView;
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        int applyDimension = (int) TypedValue.applyDimension(1, this.ICON_SIZE, context.getResources().getDisplayMetrics());
        this.startimage.getLayoutParams().height = applyDimension;
        this.startimage.getLayoutParams().width = applyDimension;
        this.startimage.setScaleType(ImageView.ScaleType.FIT_XY);
        byte[] decode = Base64.decode(Icon(), 0);
        this.startimage.setImageBitmap(BitmapFactory.decodeByteArray(decode, 0, decode.length));
        ((ViewGroup.MarginLayoutParams) this.startimage.getLayoutParams()).topMargin = convertDipToPixels(10);
        this.startimage.setOnTouchListener(onTouchListener());
        this.startimage.setOnClickListener(new View.OnClickListener() { // from class: com.android.support.Menu.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Menu.this.mCollapsed.setVisibility(8);
                Menu.this.mExpanded.setVisibility(0);
            }
        });
        WebView wView = new WebView(context);
        wView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        int applyDimension2 = (int) TypedValue.applyDimension(1, this.ICON_SIZE, context.getResources().getDisplayMetrics());
        wView.getLayoutParams().height = applyDimension2;
        wView.getLayoutParams().width = applyDimension2;
        wView.loadData("<html><head></head><body style=\"margin: 0; padding: 0\"><img src=\"" + IconWebViewData() + "\" width=\"" + this.ICON_SIZE + "\" height=\"" + this.ICON_SIZE + "\" ></body></html>", "text/html", "utf-8");
        wView.setBackgroundColor(0);
        wView.setAlpha(this.ICON_ALPHA);
        wView.getSettings().setAppCacheEnabled(true);
        wView.setOnTouchListener(onTouchListener());
        TextView settings = new TextView(context);
        settings.setText(Build.VERSION.SDK_INT >= 23 ? "⚙" : "🔧");
        settings.setTextColor(this.TEXT_COLOR);
        settings.setTypeface(Typeface.DEFAULT_BOLD);
        settings.setTextSize(20.0f);
        RelativeLayout.LayoutParams rlsettings = new RelativeLayout.LayoutParams(-2, -2);
        rlsettings.addRule(11);
        settings.setLayoutParams(rlsettings);
        settings.setOnClickListener(new View.OnClickListener() { // from class: com.android.support.Menu.2
            boolean settingsOpen;

            @Override // android.view.View.OnClickListener
            public void onClick(View v10) {
                try {
                    boolean z10 = !this.settingsOpen;
                    this.settingsOpen = z10;
                    if (z10) {
                        Menu.this.scrollView.removeView(Menu.this.mods);
                        Menu.this.scrollView.addView(Menu.this.mSettings);
                        Menu.this.scrollView.scrollTo(0, 0);
                    } else {
                        Menu.this.scrollView.removeView(Menu.this.mSettings);
                        Menu.this.scrollView.addView(Menu.this.mods);
                    }
                } catch (IllegalStateException e10) {
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.mSettings = linearLayout2;
        linearLayout2.setOrientation(1);
        featureList(SettingsList(), this.mSettings);
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        relativeLayout2.setPadding(10, 5, 10, 5);
        relativeLayout2.setVerticalGravity(16);
        TextView title = new TextView(context);
        title.setTextColor(this.TEXT_COLOR);
        title.setTextSize(18.0f);
        title.setGravity(17);
        RelativeLayout.LayoutParams rl2 = new RelativeLayout.LayoutParams(-2, -2);
        rl2.addRule(14);
        title.setLayoutParams(rl2);
        TextView subTitle = new TextView(context);
        subTitle.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        subTitle.setMarqueeRepeatLimit(-1);
        subTitle.setSingleLine(true);
        subTitle.setSelected(true);
        subTitle.setTextColor(this.TEXT_COLOR);
        subTitle.setTextSize(10.0f);
        subTitle.setGravity(17);
        subTitle.setPadding(0, 0, 0, 5);
        this.scrollView = new ScrollView(context);
        this.scrlLL = new LinearLayout.LayoutParams(-1, dp(this.MENU_HEIGHT));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.mExpanded.getLayoutParams());
        this.scrlLLExpanded = layoutParams;
        layoutParams.weight = 1.0f;
        this.scrollView.setLayoutParams(Preferences.isExpanded ? this.scrlLLExpanded : this.scrlLL);
        this.scrollView.setBackgroundColor(this.MENU_FEATURE_BG_COLOR);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.mods = linearLayout3;
        linearLayout3.setOrientation(1);
        final ScrollView scrollView2 = new ScrollView(context);
        scrollView2.setLayoutParams(Preferences.isExpanded ? this.scrlLLExpanded : this.scrlLL);
        scrollView2.setBackgroundColor(this.MENU_FEATURE_BG_COLOR);
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.mods2 = linearLayout4;
        linearLayout4.setOrientation(1);
        RelativeLayout relativeLayout3 = new RelativeLayout(context);
        relativeLayout3.setPadding(10, 3, 10, 3);
        relativeLayout3.setVerticalGravity(17);
        RelativeLayout.LayoutParams lParamsHideBtn = new RelativeLayout.LayoutParams(-2, -2);
        lParamsHideBtn.addRule(9);
        Button hideBtn = new Button(context);
        hideBtn.setLayoutParams(lParamsHideBtn);
        hideBtn.setBackgroundColor(0);
        hideBtn.setText("HIDE/KILL (Hold)");
        hideBtn.setTextColor(this.TEXT_COLOR);
        hideBtn.setOnClickListener(new View.OnClickListener() { // from class: com.android.support.Menu.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Menu.this.mCollapsed.setVisibility(0);
                Menu.this.mCollapsed.setAlpha(0.0f);
                Menu.this.mExpanded.setVisibility(8);
                Toast.makeText(view.getContext(), "Icon hidden. Remember the hidden icon position", 1).show();
            }
        });
        hideBtn.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.android.support.Menu.4
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                Toast.makeText(view.getContext(), "Menu killed", 1).show();
                Menu.this.rootFrame.removeView(Menu.this.mRootContainer);
                Menu.this.mWindowManager.removeView(Menu.this.rootFrame);
                return false;
            }
        });
        RelativeLayout.LayoutParams lParamsCloseBtn = new RelativeLayout.LayoutParams(-2, -2);
        lParamsCloseBtn.addRule(11);
        Button closeBtn = new Button(context);
        closeBtn.setLayoutParams(lParamsCloseBtn);
        closeBtn.setBackgroundColor(0);
        closeBtn.setText("MINIMIZE");
        closeBtn.setTextColor(this.TEXT_COLOR);
        closeBtn.setOnClickListener(new View.OnClickListener() { // from class: com.android.support.Menu.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Menu.this.mCollapsed.setVisibility(0);
                Menu.this.mCollapsed.setAlpha(Menu.this.ICON_ALPHA);
                Menu.this.mExpanded.setVisibility(8);
            }
        });
        final Button Menu1 = new Button(context);
        GradientDrawable SubMenu1 = new GradientDrawable();
        SubMenu1.setStroke(4, Color.parseColor("#EE1C2A35"));
        SubMenu1.setColor(Color.parseColor("#EE1C2A35"));
        SubMenu1.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        Menu1.setBackground(SubMenu1);
        Menu1.setText("Русский язык");
        Menu1.setTextSize(10.0f);
        Menu1.setTypeface(null, 1);
        Menu1.setTextColor(Color.parseColor("#FFFFFF"));
        Menu1.setLayoutParams(new LinearLayout.LayoutParams(dp(145), dp(39)));
        final Button Menu2 = new Button(context);
        GradientDrawable SubMenu2 = new GradientDrawable();
        SubMenu2.setStroke(2, Color.parseColor("#EE1C2A35"));
        SubMenu2.setColor(Color.parseColor("#EE1C2A35"));
        SubMenu2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        Menu2.setBackground(SubMenu2);
        Menu2.setText("Language english");
        Menu2.setTextSize(10.0f);
        Menu2.setTypeface(null, 1);
        Menu2.setTextColor(Color.parseColor("#FFFFFF"));
        Menu2.setLayoutParams(new LinearLayout.LayoutParams(dp(145), dp(39)));
        Menu1.setOnClickListener(new View.OnClickListener() { // from class: com.android.support.Menu.6
            @Override // android.view.View.OnClickListener
            public void onClick(View v10) {
                GradientDrawable SubMenu3 = new GradientDrawable();
                SubMenu3.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
                int i10 = 6 ^ 4;
                SubMenu3.setStroke(4, Color.parseColor("#EE1C2A35"));
                SubMenu3.setColor(Color.parseColor("#EE1C2A35"));
                Menu1.setBackground(SubMenu3);
                Menu1.setTextColor(Color.parseColor("#FFFFFF"));
                GradientDrawable SubMenu4 = new GradientDrawable();
                SubMenu4.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
                SubMenu4.setStroke(2, Color.parseColor("#EE1C2A35"));
                SubMenu4.setColor(Color.parseColor("#EE1C2A35"));
                Menu2.setBackground(SubMenu4);
                Menu2.setTextColor(Color.parseColor("#FFFFFF"));
                Menu.this.scrollView.setVisibility(0);
                scrollView2.setVisibility(8);
            }
        });
        this.patches6.addView(Menu1);
        Menu2.setOnClickListener(new View.OnClickListener() { // from class: com.android.support.Menu.7
            @Override // android.view.View.OnClickListener
            public void onClick(View v10) {
                GradientDrawable SubMenu3 = new GradientDrawable();
                SubMenu3.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
                SubMenu3.setStroke(2, Color.parseColor("#EE1C2A35"));
                SubMenu3.setColor(Color.parseColor("#EE1C2A35"));
                Menu1.setBackground(SubMenu3);
                Menu1.setTextColor(Color.parseColor("#FFFFFF"));
                GradientDrawable SubMenu4 = new GradientDrawable();
                SubMenu4.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
                SubMenu4.setStroke(4, Color.parseColor("#EE1C2A35"));
                SubMenu4.setColor(Color.parseColor("#EE1C2A35"));
                Menu2.setBackground(SubMenu4);
                Menu2.setTextColor(Color.parseColor("#FFFFFF"));
                new GradientDrawable();
                Menu.this.scrollView.setVisibility(8);
                scrollView2.setVisibility(0);
            }
        });
        this.patches6.addView(Menu2);
        this.mRootContainer.addView(this.mCollapsed);
        this.mRootContainer.addView(this.mExpanded);
        if (IconWebViewData() == null) {
            this.mCollapsed.addView(this.startimage);
        } else {
            this.mCollapsed.addView(wView);
        }
        relativeLayout2.addView(title);
        relativeLayout2.addView(settings);
        this.mExpanded.addView(relativeLayout2);
        this.mExpanded.addView(subTitle);
        this.mExpanded.addView(this.patches6);
        this.mExpanded.addView(outeroption2);
        outeroption2.addView(this.scrollView);
        this.scrollView.addView(this.mods);
        outeroption2.addView(scrollView2);
        scrollView2.addView(this.mods2);
        relativeLayout3.addView(hideBtn);
        relativeLayout3.addView(closeBtn);
        this.mExpanded.addView(relativeLayout3);
        Init(context, title, subTitle);
    }

    public void ShowMenu() {
        this.rootFrame.addView(this.mRootContainer);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() { // from class: com.android.support.Menu.8
            boolean viewLoaded = false;

            @Override // java.lang.Runnable
            public void run() {
                if (Preferences.loadPref && !Menu.this.IsGameLibLoaded() && !Menu.this.stopChecking) {
                    if (!this.viewLoaded) {
                        Menu menu = Menu.this;
                        menu.Category(menu.mods, "Save preferences was been enabled. Waiting for game lib to be loaded...\n\nForce load menu may not apply mods instantly. You would need to reactivate them again");
                        Menu menu2 = Menu.this;
                        menu2.Button(menu2.mods, -100, "Force load menu");
                        this.viewLoaded = true;
                    }
                    handler.postDelayed(this, 600L);
                } else {
                    Menu.this.mods.removeAllViews();
                    Menu menu3 = Menu.this;
                    menu3.featureList(menu3.GetFeatureList(), Menu.this.mods);
                    Menu menu4 = Menu.this;
                    menu4.featureList2(menu4.GetFeatureList(), Menu.this.mods2);
                }
            }
        }, 500L);
    }

    public void SetWindowManagerWindowService() {
        int iparams = Build.VERSION.SDK_INT >= 26 ? 2038 : x0.H1;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, iparams, 8, -3);
        this.vmParams = layoutParams;
        layoutParams.gravity = 51;
        this.vmParams.x = this.POS_X;
        this.vmParams.y = this.POS_Y;
        WindowManager windowManager = (WindowManager) this.getContext.getSystemService("window");
        this.mWindowManager = windowManager;
        windowManager.addView(this.rootFrame, this.vmParams);
        int i10 = 5 << 1;
        this.overlayRequired = true;
    }

    public void SetWindowManagerActivity() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, this.POS_X, this.POS_Y, 2, 41943304, -2);
        this.vmParams = layoutParams;
        layoutParams.gravity = 51;
        this.vmParams.x = this.POS_X;
        this.vmParams.y = this.POS_Y;
        WindowManager windowManager = ((Activity) this.getContext).getWindowManager();
        this.mWindowManager = windowManager;
        windowManager.addView(this.rootFrame, this.vmParams);
    }

    private View.OnTouchListener onTouchListener() {
        return new View.OnTouchListener() { // from class: com.android.support.Menu.9
            final View collapsedView;
            final View expandedView;
            private float initialTouchX;
            private float initialTouchY;
            private int initialX;
            private int initialY;

            {
                this.collapsedView = Menu.this.mCollapsed;
                this.expandedView = Menu.this.mExpanded;
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 0:
                        this.initialX = Menu.this.vmParams.x;
                        this.initialY = Menu.this.vmParams.y;
                        this.initialTouchX = motionEvent.getRawX();
                        this.initialTouchY = motionEvent.getRawY();
                        return true;
                    case 1:
                        int rawX = (int) (motionEvent.getRawX() - this.initialTouchX);
                        int rawY = (int) (motionEvent.getRawY() - this.initialTouchY);
                        Menu.this.mExpanded.setAlpha(1.0f);
                        Menu.this.mCollapsed.setAlpha(1.0f);
                        if (rawX < 10 && rawY < 10 && Menu.this.isViewCollapsed()) {
                            try {
                                this.collapsedView.setVisibility(8);
                                this.expandedView.setVisibility(0);
                                break;
                            } catch (NullPointerException e10) {
                            }
                        }
                        return true;
                    case 2:
                        Menu.this.mExpanded.setAlpha(0.5f);
                        Menu.this.mCollapsed.setAlpha(0.5f);
                        Menu.this.vmParams.x = this.initialX + ((int) (motionEvent.getRawX() - this.initialTouchX));
                        Menu.this.vmParams.y = this.initialY + ((int) (motionEvent.getRawY() - this.initialTouchY));
                        Menu.this.mWindowManager.updateViewLayout(Menu.this.rootFrame, Menu.this.vmParams);
                        return true;
                    default:
                        return false;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:68:0x0139  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void featureList(String[] listFT, LinearLayout linearLayout) {
        boolean switchedOn;
        LinearLayout linearLayout2;
        int subFeat;
        String feature;
        int featNum;
        byte b10;
        int i10;
        LinearLayout llBak = linearLayout;
        int i11 = 0;
        int subFeat2 = 0;
        while (i11 < listFT.length) {
            String feature2 = listFT[i11];
            if (!feature2.contains("_True")) {
                switchedOn = false;
            } else {
                feature2 = feature2.replaceFirst("_True", "");
                switchedOn = true;
            }
            LinearLayout linearLayout3 = llBak;
            if (!feature2.contains("CollapseAdd_")) {
                linearLayout2 = linearLayout3;
            } else {
                LinearLayout linearLayout4 = this.mCollapse;
                feature2 = feature2.replaceFirst("CollapseAdd_", "");
                linearLayout2 = linearLayout4;
            }
            String[] str = feature2.split("_");
            if (TextUtils.isDigitsOnly(str[0]) || str[0].matches("-[0-9]*")) {
                int featNum2 = Integer.parseInt(str[0]);
                subFeat = subFeat2 + 1;
                feature = feature2.replaceFirst(str[0] + "_", "");
                featNum = featNum2;
            } else {
                subFeat = subFeat2;
                feature = feature2;
                featNum = i11 - subFeat2;
            }
            String[] strSplit = feature.split("_");
            String str2 = strSplit[0];
            switch (str2.hashCode()) {
                case -1943191956:
                    if (!str2.equals("ButtonLink")) {
                        b10 = -1;
                    } else {
                        b10 = 11;
                    }
                    break;
                case -1784436876:
                    if (!str2.equals("Toggle")) {
                        b10 = -1;
                    } else {
                        b10 = 0;
                    }
                    break;
                case -923700249:
                    if (!str2.equals("InputValue")) {
                        b10 = -1;
                    } else {
                        b10 = 6;
                    }
                    break;
                case -658531749:
                    if (!str2.equals("SeekBar")) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case -584041481:
                    if (!str2.equals("InputText")) {
                        b10 = -1;
                    } else {
                        b10 = 5;
                    }
                    break;
                case -567441459:
                    if (!str2.equals("Collapse")) {
                        b10 = -1;
                    } else {
                        b10 = 10;
                    }
                    break;
                case -339785223:
                    if (!str2.equals("Spinner")) {
                        b10 = -1;
                    } else {
                        b10 = 4;
                    }
                    break;
                case -106518818:
                    if (!str2.equals("ButtonOnOff")) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case 82909838:
                    if (!str2.equals("RichTextView")) {
                        b10 = -1;
                    } else {
                        b10 = c.f116462o;
                    }
                    break;
                case 115155230:
                    if (!str2.equals("Category")) {
                        b10 = -1;
                    } else {
                        b10 = c.f116461n;
                    }
                    break;
                case 427235197:
                    if (!str2.equals("RichWebView")) {
                        b10 = -1;
                    } else {
                        b10 = c.f116463p;
                    }
                    break;
                case 776382189:
                    if (!str2.equals("RadioButton")) {
                        b10 = -1;
                    } else {
                        b10 = 9;
                    }
                    break;
                case 1133277359:
                    if (!str2.equals("InputLValue")) {
                        b10 = -1;
                    } else {
                        b10 = 7;
                    }
                    break;
                case 1601505219:
                    if (!str2.equals("CheckBox")) {
                        b10 = -1;
                    } else {
                        b10 = 8;
                    }
                    break;
                case 2001146706:
                    if (!str2.equals("Button")) {
                        b10 = -1;
                    } else {
                        b10 = 2;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    llBak = llBak;
                    Switch(linearLayout2, featNum, strSplit[1], switchedOn);
                    break;
                case 1:
                    llBak = llBak;
                    SeekBar(linearLayout2, featNum, strSplit[1], Integer.parseInt(strSplit[2]), Integer.parseInt(strSplit[3]));
                    break;
                case 2:
                    llBak = llBak;
                    Button(linearLayout2, featNum, strSplit[1]);
                    break;
                case 3:
                    llBak = llBak;
                    ButtonOnOff(linearLayout2, featNum, strSplit[1], switchedOn);
                    break;
                case 4:
                    llBak = llBak;
                    TextView(linearLayout2, strSplit[1]);
                    Spinner(linearLayout2, featNum, strSplit[1], strSplit[2]);
                    break;
                case 5:
                    llBak = llBak;
                    InputText(linearLayout2, featNum, strSplit[1]);
                    break;
                case 6:
                    llBak = llBak;
                    if (strSplit.length == 3) {
                        InputNum(linearLayout2, featNum, strSplit[2], Integer.parseInt(strSplit[1]));
                    }
                    if (strSplit.length == 2) {
                        InputNum(linearLayout2, featNum, strSplit[1], 0);
                    }
                    break;
                case 7:
                    if (strSplit.length == 3) {
                        i10 = 2;
                        InputLNum(linearLayout2, featNum, strSplit[2], Long.parseLong(strSplit[1]));
                    } else {
                        i10 = 2;
                    }
                    if (strSplit.length == i10) {
                        InputLNum(linearLayout2, featNum, strSplit[1], 0L);
                    }
                    break;
                case 8:
                    CheckBox(linearLayout2, featNum, strSplit[1], switchedOn);
                    llBak = llBak;
                    break;
                case 9:
                    RadioButton(linearLayout2, featNum, strSplit[1], strSplit[2]);
                    llBak = llBak;
                    break;
                case 10:
                    Collapse(linearLayout2, strSplit[1], switchedOn);
                    subFeat++;
                    llBak = llBak;
                    break;
                case 11:
                    subFeat++;
                    ButtonLink(linearLayout2, strSplit[1], strSplit[2]);
                    llBak = llBak;
                    break;
                case 12:
                    subFeat++;
                    Category(linearLayout2, strSplit[1]);
                    llBak = llBak;
                    break;
                case 13:
                    subFeat++;
                    TextView(linearLayout2, strSplit[1]);
                    llBak = llBak;
                    break;
                case 14:
                    subFeat++;
                    WebTextView(linearLayout2, strSplit[1]);
                    llBak = llBak;
                    break;
                default:
                    llBak = llBak;
                    break;
            }
            subFeat2 = subFeat;
            i11++;
            llBak = llBak;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:68:0x013e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void featureList2(String[] listFT, LinearLayout linearLayout) {
        boolean switchedOn;
        LinearLayout linearLayout2;
        int subFeat;
        String feature;
        int featNum;
        byte b10;
        int i10;
        LinearLayout llBak = linearLayout;
        int i11 = 0;
        int subFeat2 = 0;
        while (i11 < listFT.length) {
            String feature2 = listFT[i11];
            if (!feature2.contains("_True")) {
                switchedOn = false;
            } else {
                feature2 = feature2.replaceFirst("_True", "");
                switchedOn = true;
            }
            LinearLayout linearLayout3 = llBak;
            if (!feature2.contains("CollapseAdd2_")) {
                linearLayout2 = linearLayout3;
            } else {
                LinearLayout linearLayout4 = this.mCollapse;
                feature2 = feature2.replaceFirst("CollapseAdd2_", "");
                linearLayout2 = linearLayout4;
            }
            String[] str = feature2.split("_");
            if (TextUtils.isDigitsOnly(str[0]) || str[0].matches("-[0-9]*")) {
                int featNum2 = Integer.parseInt(str[0]);
                subFeat = subFeat2 + 1;
                feature = feature2.replaceFirst(str[0] + "_", "");
                featNum = featNum2;
            } else {
                subFeat = subFeat2;
                feature = feature2;
                featNum = i11 - subFeat2;
            }
            String[] strSplit = feature.split("_");
            String str2 = strSplit[0];
            switch (str2.hashCode()) {
                case -1943407271:
                    if (!str2.equals("Spinner2")) {
                        b10 = -1;
                    } else {
                        b10 = 4;
                    }
                    break;
                case -1892945713:
                    if (!str2.equals("CheckBox2")) {
                        b10 = -1;
                    } else {
                        b10 = 8;
                    }
                    break;
                case -1724762268:
                    if (!str2.equals("RichTextView2")) {
                        b10 = -1;
                    } else {
                        b10 = c.f116462o;
                    }
                    break;
                case -1701955867:
                    if (!str2.equals("RadioButton2")) {
                        b10 = -1;
                    } else {
                        b10 = 9;
                    }
                    break;
                case -925416677:
                    if (!str2.equals("InputText2")) {
                        b10 = -1;
                    } else {
                        b10 = 5;
                    }
                    break;
                case -725155116:
                    if (!str2.equals("Category2")) {
                        b10 = -1;
                    } else {
                        b10 = c.f116461n;
                    }
                    break;
                case -410815995:
                    if (!str2.equals("Collapse2")) {
                        b10 = -1;
                    } else {
                        b10 = 10;
                    }
                    break;
                case -109408442:
                    if (!str2.equals("ButtonLink2")) {
                        b10 = -1;
                    } else {
                        b10 = 11;
                    }
                    break;
                case 359389269:
                    if (!str2.equals("RichWebView2")) {
                        b10 = -1;
                    } else {
                        b10 = c.f116463p;
                    }
                    break;
                case 517031742:
                    if (!str2.equals("Toggle2")) {
                        b10 = -1;
                    } else {
                        b10 = 0;
                    }
                    break;
                case 771859811:
                    if (!str2.equals("InputLValue2")) {
                        b10 = -1;
                    } else {
                        b10 = 7;
                    }
                    break;
                case 992883988:
                    if (!str2.equals("ButtonOnOff2")) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case 1060352311:
                    if (!str2.equals("SeekBar2")) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case 1430063403:
                    if (!str2.equals("InputValue2")) {
                        b10 = -1;
                    } else {
                        b10 = 6;
                    }
                    break;
                case 1906005792:
                    if (!str2.equals("Button2")) {
                        b10 = -1;
                    } else {
                        b10 = 2;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    llBak = llBak;
                    Switch(linearLayout2, featNum, strSplit[1], switchedOn);
                    break;
                case 1:
                    llBak = llBak;
                    SeekBar(linearLayout2, featNum, strSplit[1], Integer.parseInt(strSplit[2]), Integer.parseInt(strSplit[3]));
                    break;
                case 2:
                    llBak = llBak;
                    Button(linearLayout2, featNum, strSplit[1]);
                    break;
                case 3:
                    llBak = llBak;
                    ButtonOnOff(linearLayout2, featNum, strSplit[1], switchedOn);
                    break;
                case 4:
                    llBak = llBak;
                    TextView(linearLayout2, strSplit[1]);
                    Spinner(linearLayout2, featNum, strSplit[1], strSplit[2]);
                    break;
                case 5:
                    llBak = llBak;
                    InputText(linearLayout2, featNum, strSplit[1]);
                    break;
                case 6:
                    llBak = llBak;
                    if (strSplit.length == 3) {
                        InputNum(linearLayout2, featNum, strSplit[2], Integer.parseInt(strSplit[1]));
                    }
                    if (strSplit.length == 2) {
                        InputNum(linearLayout2, featNum, strSplit[1], 0);
                    }
                    break;
                case 7:
                    if (strSplit.length == 3) {
                        i10 = 2;
                        InputLNum(linearLayout2, featNum, strSplit[2], Long.parseLong(strSplit[1]));
                    } else {
                        i10 = 2;
                    }
                    if (strSplit.length == i10) {
                        InputLNum(linearLayout2, featNum, strSplit[1], 0L);
                    }
                    break;
                case 8:
                    CheckBox(linearLayout2, featNum, strSplit[1], switchedOn);
                    llBak = llBak;
                    break;
                case 9:
                    RadioButton(linearLayout2, featNum, strSplit[1], strSplit[2]);
                    llBak = llBak;
                    break;
                case 10:
                    Collapse(linearLayout2, strSplit[1], switchedOn);
                    subFeat++;
                    llBak = llBak;
                    continue;
                    subFeat2 = subFeat;
                    i11++;
                    llBak = llBak;
                    break;
                case 11:
                    subFeat++;
                    ButtonLink(linearLayout2, strSplit[1], strSplit[2]);
                    llBak = llBak;
                    continue;
                    subFeat2 = subFeat;
                    i11++;
                    llBak = llBak;
                    break;
                case 12:
                    subFeat++;
                    Category(linearLayout2, strSplit[1]);
                    llBak = llBak;
                    continue;
                    subFeat2 = subFeat;
                    i11++;
                    llBak = llBak;
                    break;
                case 13:
                    subFeat++;
                    TextView(linearLayout2, strSplit[1]);
                    llBak = llBak;
                    continue;
                    subFeat2 = subFeat;
                    i11++;
                    llBak = llBak;
                    break;
                case 14:
                    subFeat++;
                    WebTextView(linearLayout2, strSplit[1]);
                    llBak = llBak;
                    continue;
                    subFeat2 = subFeat;
                    i11++;
                    llBak = llBak;
                    break;
                default:
                    llBak = llBak;
                    break;
            }
            subFeat2 = subFeat;
            i11++;
            llBak = llBak;
        }
    }

    private void Switch(LinearLayout linLayout, final int featNum, final String featName, boolean swiOn) {
        final Switch switchR = new Switch(this.getContext);
        ColorStateList buttonStates = new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_checked}, new int[0]}, new int[]{-16776961, this.ToggleON, this.ToggleOFF});
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                switchR.getThumbDrawable().setTintList(buttonStates);
                switchR.getTrackDrawable().setTintList(buttonStates);
            } catch (NullPointerException ex) {
                Log.d(TAG, String.valueOf(ex));
            }
        }
        switchR.setText(featName);
        switchR.setTextColor(this.TEXT_COLOR_2);
        switchR.setPadding(10, 5, 0, 5);
        switchR.setChecked(Preferences.loadPrefBool(featName, featNum, swiOn));
        switchR.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.android.support.Menu.10
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean bool) {
                Preferences.changeFeatureBool(featName, featNum, bool);
                switch (featNum) {
                    case -3:
                        Preferences.isExpanded = bool;
                        ScrollView scrollView = Menu.this.scrollView;
                        Menu menu = Menu.this;
                        scrollView.setLayoutParams(bool ? menu.scrlLLExpanded : menu.scrlLL);
                        break;
                    case -1:
                        Preferences.with(switchR.getContext()).writeBoolean(-1, bool);
                        if (!bool) {
                            Preferences.with(switchR.getContext()).clear();
                        }
                        break;
                }
            }
        });
        linLayout.addView(switchR);
    }

    private void SeekBar(LinearLayout linearLayout, final int featNum, final String featName, final int min, int max) {
        int i10;
        int loadedProg = Preferences.loadPrefInt(featName, featNum);
        LinearLayout linearLayout2 = new LinearLayout(this.getContext);
        linearLayout2.setPadding(10, 5, 0, 5);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(17);
        final TextView textView = new TextView(this.getContext);
        textView.setText(Html.fromHtml(featName + ": <font color='" + this.NumberTxtColor + "'>" + (loadedProg == 0 ? min : loadedProg)));
        textView.setTextColor(this.TEXT_COLOR_2);
        SeekBar seekBar = new SeekBar(this.getContext);
        seekBar.setPadding(25, 10, 35, 10);
        seekBar.setMax(max);
        if (Build.VERSION.SDK_INT < 26) {
            i10 = min;
        } else {
            i10 = min;
            seekBar.setMin(i10);
        }
        seekBar.setProgress(loadedProg == 0 ? i10 : loadedProg);
        seekBar.getThumb().setColorFilter(this.SeekBarColor, PorterDuff.Mode.SRC_ATOP);
        seekBar.getProgressDrawable().setColorFilter(this.SeekBarProgressColor, PorterDuff.Mode.SRC_ATOP);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.android.support.Menu.11
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar2) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar2) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar2, int i11, boolean z10) {
                int i12 = min;
                if (i11 >= i12) {
                    i12 = i11;
                }
                seekBar2.setProgress(i12);
                String str = featName;
                int i13 = featNum;
                int i14 = min;
                if (i11 >= i14) {
                    i14 = i11;
                }
                Preferences.changeFeatureInt(str, i13, i14);
                TextView textView2 = textView;
                StringBuilder sbAppend = new StringBuilder().append(featName).append(": <font color='").append(Menu.this.NumberTxtColor).append("'>");
                int i15 = min;
                if (i11 >= i15) {
                    i15 = i11;
                }
                textView2.setText(Html.fromHtml(sbAppend.append(i15).toString()));
            }
        });
        linearLayout2.addView(textView);
        linearLayout2.addView(seekBar);
        linearLayout.addView(linearLayout2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Button(LinearLayout linearLayout, final int featNum, final String featName) {
        Button button = new Button(this.getContext);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(7, 5, 7, 5);
        button.setLayoutParams(layoutParams);
        button.setTextColor(this.TEXT_COLOR_2);
        button.setAllCaps(false);
        button.setText(Html.fromHtml(featName));
        button.setBackgroundColor(this.BTN_COLOR);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.android.support.Menu.12
            @Override // android.view.View.OnClickListener
            public void onClick(View v10) {
                switch (featNum) {
                    case -100:
                        Menu.this.stopChecking = true;
                        break;
                    case -6:
                        Menu.this.scrollView.removeView(Menu.this.mSettings);
                        Menu.this.scrollView.addView(Menu.this.mods);
                        break;
                }
                Preferences.changeFeatureInt(featName, featNum, 0);
            }
        });
        linearLayout.addView(button);
    }

    private void ButtonLink(LinearLayout linearLayout, String featName, final String url) {
        Button button = new Button(this.getContext);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(7, 5, 7, 5);
        button.setLayoutParams(layoutParams);
        button.setAllCaps(false);
        button.setTextColor(this.TEXT_COLOR_2);
        button.setText(Html.fromHtml(featName));
        button.setBackgroundColor(this.BTN_COLOR);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.android.support.Menu.13
            @Override // android.view.View.OnClickListener
            public void onClick(View v10) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(268435456);
                intent.setData(Uri.parse(url));
                Menu.this.getContext.startActivity(intent);
            }
        });
        linearLayout.addView(button);
    }

    private void ButtonOnOff(LinearLayout linearLayout, int featNum, String featName, boolean switchedOn) {
        boolean isOn;
        Button button = new Button(this.getContext);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(7, 5, 7, 5);
        button.setLayoutParams(layoutParams);
        button.setTextColor(this.TEXT_COLOR_2);
        button.setAllCaps(false);
        String finalfeatName = featName.replace("OnOff_", "");
        boolean isOn2 = Preferences.loadPrefBool(featName, featNum, switchedOn);
        if (isOn2) {
            button.setText(Html.fromHtml(finalfeatName + ": ON"));
            button.setBackgroundColor(this.BtnON);
            isOn = false;
        } else {
            button.setText(Html.fromHtml(finalfeatName + ": OFF"));
            button.setBackgroundColor(this.BtnOFF);
            isOn = true;
        }
        boolean finalIsOn = isOn;
        button.setOnClickListener(new View.OnClickListener(finalIsOn, finalfeatName, featNum, button) { // from class: com.android.support.Menu.14
            boolean isOn;
            final /* synthetic */ Button val$button;
            final /* synthetic */ int val$featNum;
            final /* synthetic */ boolean val$finalIsOn;
            final /* synthetic */ String val$finalfeatName;

            {
                this.val$finalIsOn = finalIsOn;
                this.val$finalfeatName = finalfeatName;
                this.val$featNum = featNum;
                this.val$button = button;
                this.isOn = finalIsOn;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v10) {
                Preferences.changeFeatureBool(this.val$finalfeatName, this.val$featNum, this.isOn);
                if (this.isOn) {
                    this.val$button.setText(Html.fromHtml(this.val$finalfeatName + ": ON"));
                    this.val$button.setBackgroundColor(Menu.this.BtnON);
                    this.isOn = false;
                } else {
                    this.val$button.setText(Html.fromHtml(this.val$finalfeatName + ": OFF"));
                    this.val$button.setBackgroundColor(Menu.this.BtnOFF);
                    this.isOn = true;
                }
            }
        });
        linearLayout.addView(button);
    }

    private void Spinner(LinearLayout linearLayout, final int featNum, String featName, String list) {
        Log.d(TAG, "spinner " + featNum + " " + featName + " " + list);
        List<String> lists = new LinkedList<>(Arrays.asList(list.split(",")));
        LinearLayout linearLayout2 = new LinearLayout(this.getContext);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(7, 2, 7, 2);
        linearLayout2.setOrientation(1);
        linearLayout2.setBackgroundColor(this.BTN_COLOR);
        linearLayout2.setLayoutParams(layoutParams2);
        final Spinner spinner = new Spinner(this.getContext, 1);
        spinner.setLayoutParams(layoutParams2);
        spinner.getBackground().setColorFilter(1, PorterDuff.Mode.SRC_ATOP);
        ArrayAdapter aa2 = new ArrayAdapter(this.getContext, android.R.layout.simple_spinner_dropdown_item, lists);
        aa2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter((SpinnerAdapter) aa2);
        spinner.setSelection(Preferences.loadPrefInt(featName, featNum));
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.android.support.Menu.15
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id2) {
                Preferences.changeFeatureInt(spinner.getSelectedItem().toString(), featNum, position);
                ((TextView) parentView.getChildAt(0)).setTextColor(Menu.this.TEXT_COLOR_2);
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        linearLayout2.addView(spinner);
        linearLayout.addView(linearLayout2);
    }

    private void InputNum(LinearLayout linearLayout, final int featNum, final String featName, final int maxValue) {
        LinearLayout linearLayout2 = new LinearLayout(this.getContext);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(7, 5, 7, 5);
        final Button button = new Button(this.getContext);
        int num = Preferences.loadPrefInt(featName, featNum);
        button.setText(Html.fromHtml(featName + ": <font color='" + this.NumberTxtColor + "'>" + num + "</font>"));
        button.setAllCaps(false);
        button.setLayoutParams(layoutParams);
        button.setBackgroundColor(this.BTN_COLOR);
        button.setTextColor(this.TEXT_COLOR_2);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.android.support.Menu.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AlertDialog.Builder alertName = new AlertDialog.Builder(Menu.this.getContext);
                final EditText editText = new EditText(Menu.this.getContext);
                if (maxValue != 0) {
                    editText.setHint("Max value: " + maxValue);
                }
                editText.setInputType(2);
                editText.setKeyListener(DigitsKeyListener.getInstance("0123456789-"));
                InputFilter[] FilterArray = {new InputFilter.LengthFilter(10)};
                editText.setFilters(FilterArray);
                editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.android.support.Menu.16.1
                    @Override // android.view.View.OnFocusChangeListener
                    public void onFocusChange(View v10, boolean hasFocus) {
                        Context context = Menu.this.getContext;
                        Context context2 = Menu.this.getContext;
                        InputMethodManager imm = (InputMethodManager) context.getSystemService("input_method");
                        if (!hasFocus) {
                            imm.toggleSoftInput(1, 0);
                        } else {
                            imm.toggleSoftInput(2, 1);
                        }
                    }
                });
                editText.requestFocus();
                alertName.setTitle("Input number");
                alertName.setView(editText);
                LinearLayout layoutName = new LinearLayout(Menu.this.getContext);
                layoutName.setOrientation(1);
                layoutName.addView(editText);
                alertName.setView(layoutName);
                alertName.setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: com.android.support.Menu.16.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialog, int whichButton) {
                        int num2;
                        try {
                            String inp = editText.getText().toString();
                            num2 = Integer.parseInt(inp.isEmpty() ? p.f99189d0 : inp);
                            if (maxValue != 0 && num2 >= maxValue) {
                                num2 = maxValue;
                            }
                        } catch (NumberFormatException e10) {
                            num2 = maxValue != 0 ? maxValue : Integer.MAX_VALUE;
                        }
                        button.setText(Html.fromHtml(featName + ": <font color='" + Menu.this.NumberTxtColor + "'>" + num2 + "</font>"));
                        Preferences.changeFeatureInt(featName, featNum, num2);
                        editText.setFocusable(false);
                    }
                });
                alertName.setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: com.android.support.Menu.16.3
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialog, int whichButton) {
                        Context context = Menu.this.getContext;
                        Context context2 = Menu.this.getContext;
                        InputMethodManager imm = (InputMethodManager) context.getSystemService("input_method");
                        imm.toggleSoftInput(1, 0);
                    }
                });
                if (Menu.this.overlayRequired) {
                    AlertDialog dialog = alertName.create();
                    dialog.getWindow().setType(Build.VERSION.SDK_INT >= 26 ? 2038 : x0.H1);
                    dialog.show();
                    return;
                }
                alertName.show();
            }
        });
        linearLayout2.addView(button);
        linearLayout.addView(linearLayout2);
    }

    private void InputLNum(LinearLayout linearLayout, final int featNum, final String featName, final long maxValue) {
        LinearLayout linearLayout2 = new LinearLayout(this.getContext);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(7, 5, 7, 5);
        final Button button = new Button(this.getContext);
        long num = Preferences.loadPrefLong(featName, featNum);
        button.setText(Html.fromHtml(featName + ": <font color='" + this.NumberTxtColor + "'>" + num + "</font>"));
        button.setAllCaps(false);
        button.setLayoutParams(layoutParams);
        button.setBackgroundColor(this.BTN_COLOR);
        button.setTextColor(this.TEXT_COLOR_2);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.android.support.Menu.17
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AlertDialog.Builder alertName = new AlertDialog.Builder(Menu.this.getContext);
                final EditText editText = new EditText(Menu.this.getContext);
                if (maxValue != 0) {
                    editText.setHint("Max value: " + maxValue);
                }
                editText.setInputType(2);
                editText.setKeyListener(DigitsKeyListener.getInstance("0123456789-"));
                InputFilter[] FilterArray = {new InputFilter.LengthFilter(20)};
                editText.setFilters(FilterArray);
                editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.android.support.Menu.17.1
                    @Override // android.view.View.OnFocusChangeListener
                    public void onFocusChange(View v10, boolean hasFocus) {
                        Context context = Menu.this.getContext;
                        Context context2 = Menu.this.getContext;
                        InputMethodManager imm = (InputMethodManager) context.getSystemService("input_method");
                        if (!hasFocus) {
                            imm.toggleSoftInput(1, 0);
                        } else {
                            int i10 = 0 << 2;
                            imm.toggleSoftInput(2, 1);
                        }
                    }
                });
                editText.requestFocus();
                alertName.setTitle("Input number");
                alertName.setView(editText);
                LinearLayout layoutName = new LinearLayout(Menu.this.getContext);
                layoutName.setOrientation(1);
                layoutName.addView(editText);
                alertName.setView(layoutName);
                alertName.setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: com.android.support.Menu.17.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialog, int whichButton) {
                        long num2;
                        try {
                            String inp = editText.getText().toString();
                            num2 = Long.parseLong(inp.isEmpty() ? p.f99189d0 : inp);
                            if (maxValue != 0 && num2 >= maxValue) {
                                num2 = maxValue;
                            }
                        } catch (NumberFormatException e10) {
                            num2 = maxValue != 0 ? maxValue : Long.MAX_VALUE;
                        }
                        button.setText(Html.fromHtml(featName + ": <font color='" + Menu.this.NumberTxtColor + "'>" + num2 + "</font>"));
                        Preferences.changeFeatureLong(featName, featNum, num2);
                        editText.setFocusable(false);
                    }
                });
                alertName.setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: com.android.support.Menu.17.3
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialog, int whichButton) {
                        Context context = Menu.this.getContext;
                        Context context2 = Menu.this.getContext;
                        InputMethodManager imm = (InputMethodManager) context.getSystemService("input_method");
                        imm.toggleSoftInput(1, 0);
                    }
                });
                if (Menu.this.overlayRequired) {
                    AlertDialog dialog = alertName.create();
                    dialog.getWindow().setType(Build.VERSION.SDK_INT >= 26 ? 2038 : x0.H1);
                    dialog.show();
                    return;
                }
                alertName.show();
            }
        });
        linearLayout2.addView(button);
        linearLayout.addView(linearLayout2);
    }

    private void InputText(LinearLayout linearLayout, final int featNum, final String featName) {
        LinearLayout linearLayout2 = new LinearLayout(this.getContext);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(7, 5, 7, 5);
        final Button button = new Button(this.getContext);
        String string = Preferences.loadPrefString(featName, featNum);
        button.setText(Html.fromHtml(featName + ": <font color='" + this.NumberTxtColor + "'>" + string + "</font>"));
        button.setAllCaps(false);
        button.setLayoutParams(layoutParams);
        button.setBackgroundColor(this.BTN_COLOR);
        button.setTextColor(this.TEXT_COLOR_2);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.android.support.Menu.18
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AlertDialog.Builder alertName = new AlertDialog.Builder(Menu.this.getContext);
                final EditText editText = new EditText(Menu.this.getContext);
                editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.android.support.Menu.18.1
                    @Override // android.view.View.OnFocusChangeListener
                    public void onFocusChange(View v10, boolean hasFocus) {
                        Context context = Menu.this.getContext;
                        Context context2 = Menu.this.getContext;
                        InputMethodManager imm = (InputMethodManager) context.getSystemService("input_method");
                        if (hasFocus) {
                            imm.toggleSoftInput(2, 1);
                        } else {
                            imm.toggleSoftInput(1, 0);
                        }
                    }
                });
                editText.requestFocus();
                alertName.setTitle("Input text");
                alertName.setView(editText);
                LinearLayout layoutName = new LinearLayout(Menu.this.getContext);
                layoutName.setOrientation(1);
                layoutName.addView(editText);
                alertName.setView(layoutName);
                alertName.setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: com.android.support.Menu.18.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String str = editText.getText().toString();
                        button.setText(Html.fromHtml(featName + ": <font color='" + Menu.this.NumberTxtColor + "'>" + str + "</font>"));
                        Preferences.changeFeatureString(featName, featNum, str);
                        editText.setFocusable(false);
                    }
                });
                alertName.setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: com.android.support.Menu.18.3
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialog, int whichButton) {
                        Context context = Menu.this.getContext;
                        Context context2 = Menu.this.getContext;
                        InputMethodManager imm = (InputMethodManager) context.getSystemService("input_method");
                        int i10 = 5 ^ 1;
                        imm.toggleSoftInput(1, 0);
                    }
                });
                if (Menu.this.overlayRequired) {
                    AlertDialog dialog = alertName.create();
                    dialog.getWindow().setType(Build.VERSION.SDK_INT >= 26 ? 2038 : x0.H1);
                    dialog.show();
                    return;
                }
                alertName.show();
            }
        });
        linearLayout2.addView(button);
        linearLayout.addView(linearLayout2);
    }

    private void CheckBox(LinearLayout linLayout, final int featNum, final String featName, boolean switchedOn) {
        final CheckBox checkBox = new CheckBox(this.getContext);
        checkBox.setText(featName);
        checkBox.setTextColor(this.TEXT_COLOR_2);
        if (Build.VERSION.SDK_INT >= 21) {
            checkBox.setButtonTintList(ColorStateList.valueOf(this.CheckBoxColor));
        }
        checkBox.setChecked(Preferences.loadPrefBool(featName, featNum, switchedOn));
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.android.support.Menu.19
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!checkBox.isChecked()) {
                    Preferences.changeFeatureBool(featName, featNum, isChecked);
                } else {
                    Preferences.changeFeatureBool(featName, featNum, isChecked);
                }
            }
        });
        linLayout.addView(checkBox);
    }

    private void RadioButton(LinearLayout linearLayout, final int featNum, final String featName, String list) {
        List<String> lists = new LinkedList<>(Arrays.asList(list.split(",")));
        final TextView textView = new TextView(this.getContext);
        textView.setText(featName + ":");
        textView.setTextColor(this.TEXT_COLOR_2);
        final RadioGroup radioGroup = new RadioGroup(this.getContext);
        radioGroup.setPadding(10, 5, 10, 5);
        radioGroup.setOrientation(1);
        radioGroup.addView(textView);
        for (int i10 = 0; i10 < lists.size(); i10++) {
            final RadioButton Radioo = new RadioButton(this.getContext);
            final String radioName = lists.get(i10);
            View.OnClickListener first_radio_listener = new View.OnClickListener() { // from class: com.android.support.Menu.20
                @Override // android.view.View.OnClickListener
                public void onClick(View v10) {
                    textView.setText(Html.fromHtml(featName + ": <font color='" + Menu.this.NumberTxtColor + "'>" + radioName));
                    Preferences.changeFeatureInt(featName, featNum, radioGroup.indexOfChild(Radioo));
                }
            };
            System.out.println(lists.get(i10));
            Radioo.setText(lists.get(i10));
            Radioo.setTextColor(-3355444);
            if (Build.VERSION.SDK_INT >= 21) {
                Radioo.setButtonTintList(ColorStateList.valueOf(this.RadioColor));
            }
            Radioo.setOnClickListener(first_radio_listener);
            radioGroup.addView(Radioo);
        }
        int index = Preferences.loadPrefInt(featName, featNum);
        if (index > 0) {
            textView.setText(Html.fromHtml(featName + ": <font color='" + this.NumberTxtColor + "'>" + lists.get(index - 1)));
            ((RadioButton) radioGroup.getChildAt(index)).setChecked(true);
        }
        linearLayout.addView(radioGroup);
    }

    private void Collapse(LinearLayout linearLayout, String text, boolean expanded) {
        LinearLayout.LayoutParams layoutParamsLL = new LinearLayout.LayoutParams(-1, -1);
        layoutParamsLL.setMargins(0, 5, 0, 0);
        LinearLayout collapse = new LinearLayout(this.getContext);
        collapse.setLayoutParams(layoutParamsLL);
        collapse.setVerticalGravity(16);
        collapse.setOrientation(1);
        LinearLayout collapseSub = new LinearLayout(this.getContext);
        collapseSub.setVerticalGravity(16);
        collapseSub.setPadding(0, 5, 0, 5);
        collapseSub.setOrientation(1);
        collapseSub.setBackgroundColor(Color.parseColor("#222D38"));
        collapseSub.setVisibility(8);
        this.mCollapse = collapseSub;
        TextView textView = new TextView(this.getContext);
        textView.setBackgroundColor(this.CollapColor);
        textView.setText("▽ " + text + " ▽");
        textView.setGravity(17);
        textView.setTextColor(this.TEXT_COLOR_2);
        textView.setTypeface(null, 1);
        textView.setPadding(0, 20, 0, 20);
        if (expanded) {
            collapseSub.setVisibility(0);
            textView.setText("△ " + text + " △");
        }
        textView.setOnClickListener(new View.OnClickListener(expanded, collapseSub, textView, text) { // from class: com.android.support.Menu.21
            boolean isChecked;
            final /* synthetic */ LinearLayout val$collapseSub;
            final /* synthetic */ boolean val$expanded;
            final /* synthetic */ String val$text;
            final /* synthetic */ TextView val$textView;

            {
                this.val$expanded = expanded;
                this.val$collapseSub = collapseSub;
                this.val$textView = textView;
                this.val$text = text;
                this.isChecked = expanded;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v10) {
                boolean z10 = !this.isChecked;
                this.isChecked = z10;
                if (z10) {
                    this.val$collapseSub.setVisibility(0);
                    this.val$textView.setText("△ " + this.val$text + " △");
                } else {
                    this.val$collapseSub.setVisibility(8);
                    this.val$textView.setText("▽ " + this.val$text + " ▽");
                }
            }
        });
        collapse.addView(textView);
        collapse.addView(collapseSub);
        linearLayout.addView(collapse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Category(LinearLayout linLayout, String text) {
        TextView textView = new TextView(this.getContext);
        textView.setBackgroundColor(this.CategoryBG);
        textView.setText(Html.fromHtml(text));
        textView.setGravity(17);
        textView.setTextColor(this.TEXT_COLOR_2);
        textView.setTypeface(null, 1);
        textView.setPadding(0, 5, 0, 5);
        linLayout.addView(textView);
    }

    private void TextView(LinearLayout linLayout, String text) {
        TextView textView = new TextView(this.getContext);
        textView.setText(Html.fromHtml(text));
        textView.setTextColor(this.TEXT_COLOR_2);
        textView.setPadding(10, 5, 10, 5);
        linLayout.addView(textView);
    }

    private void WebTextView(LinearLayout linLayout, String text) {
        WebView wView = new WebView(this.getContext);
        wView.loadData(text, "text/html", "utf-8");
        wView.setBackgroundColor(0);
        wView.setPadding(0, 5, 0, 5);
        wView.getSettings().setAppCacheEnabled(false);
        linLayout.addView(wView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isViewCollapsed() {
        return this.rootFrame == null || this.mCollapsed.getVisibility() == 0;
    }

    private int convertDipToPixels(int i10) {
        return (int) ((i10 * this.getContext.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private int dp(int i10) {
        return (int) TypedValue.applyDimension(1, i10, this.getContext.getResources().getDisplayMetrics());
    }

    public void setVisibility(int view) {
        FrameLayout frameLayout = this.rootFrame;
        if (frameLayout != null) {
            frameLayout.setVisibility(view);
        }
    }

    public void onDestroy() {
        FrameLayout frameLayout = this.rootFrame;
        if (frameLayout != null) {
            this.mWindowManager.removeView(frameLayout);
        }
    }
}
