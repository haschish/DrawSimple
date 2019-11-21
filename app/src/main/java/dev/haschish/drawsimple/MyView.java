package dev.haschish.drawsimple;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {
    float x = 10f;
    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();

        canvas.drawCircle(x, 100, 30, paint);
//        canvas.drawLine(x, 0, canvas.getWidth(),canvas.getHeight(),paint);
        x += 10;
        invalidate();
    }
}
