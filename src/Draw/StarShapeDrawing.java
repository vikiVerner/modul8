package Draw;

public class StarShapeDrawing implements ShapeDrawing {
        private static final String [][] SHAPES = {
            {//squad
                "***********",
                "***********",
                "***********",
                "***********",
                "***********"
            },
            {//Diamond
                "     *     ",
                "  *******  ",
                "***********",
                "  *******  ",
                "     *     "
            },
            {//rectangle
                 "  *******  ",
                 "  *******  ",
                 "  *******  ",
                 "  *******  ",
                 "  *******  "
            },
            {//triangle
                 "     *     ",
                 "    ***    ",
                 "   *****   ",
                 "  *******  ",
                 "***********"
            },
            {//squad
                  "   *****   ",
                  " ********* ",
                  "***********",
                  " ********* ",
                  "   *****   "
                },
        };
    @Override
    public void newDraw(String name) {
        String [] shape;

        switch (name){
          case  "Square":
              shape = SHAPES[0];
              for (String line : shape) {
                  System.out.println(line);}
            break;
          case  "Diamond":
              shape = SHAPES[1];
              for (String line : shape) {
                  System.out.println(line);}
            break;
          case  "Rectangle":
              shape = SHAPES[2];
              for (String line : shape) {
                  System.out.println(line);}
            break;
          case  "Triangle":
              shape = SHAPES[3];
              for (String line : shape) {
                  System.out.println(line);}
            break;
          case  "Circle":
              shape = SHAPES[4];
              for (String line : shape) {
                  System.out.println(line);}
            break;
        }
        }
    }

