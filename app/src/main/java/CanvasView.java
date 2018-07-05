import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CanvasView extends View{
    public CanvasView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // red
        Paint red = new Paint();
        red.setARGB(255, 255, 0, 0);
        red.setStyle(Paint.Style.FILL_AND_STROKE);

        // white
        Paint white = new Paint();
        white.setARGB(255, 255, 255, 255);
        white.setStyle(Paint.Style.FILL_AND_STROKE);


        int width = canvas.getWidth();
        int num = 5;
        for (int i = 0; i < num; i++) {
            canvas.drawCircle(width/2,
                    width/2,
                    width/2 - 70 * i,
                    i % 2 == 0 ? red : white);
        }



    }
}
