package io.intercom.android.sdk.blocks.messengercard;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.t0;

/* JADX INFO: loaded from: classes13.dex */
public class CardWebView extends WebView {
    public CardWebView(Context context) {
        super(context);
    }

    public static /* synthetic */ Unit a(CardWebView cardWebView, IntercomEvent intercomEvent) {
        cardWebView.getClass();
        if (intercomEvent == IntercomEvent.CardUpdated.INSTANCE) {
            cardWebView.reload();
        }
        return Unit.f312394a;
    }

    public void setUp() {
        getSettings().setAllowFileAccess(false);
        Injector.get().getDataLayer().listenToEvents(t0.b(), new Function1() { // from class: io.intercom.android.sdk.blocks.messengercard.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardWebView.a(this.f291544a, (IntercomEvent) obj);
            }
        });
    }

    public CardWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
