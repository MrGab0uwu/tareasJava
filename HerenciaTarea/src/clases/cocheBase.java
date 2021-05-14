package clases;

/**
 *
 * @author gab-uwu
 */
public class cocheBase {

    protected String marcaCoche, modeloCoche, colorPintura, materialCarroceria;

    public void getMarcaCoche(String marcaCoche) {
        this.marcaCoche = marcaCoche;
    }

    public String getMarcaCoche() {
        return marcaCoche;
    }

    public void setModeloCoche(String modeloCoche) {
        this.modeloCoche = modeloCoche;
    }

    public String getModeloCoche() {
        return modeloCoche;
    }
    
    public void setColorPintura(String colorPintura) {
        this.colorPintura = colorPintura;
    }

    public String getColorPintura() {
        return colorPintura;
    }

    public void setMaterialCarroceria(String materialCarroceria) {
        this.materialCarroceria = materialCarroceria;
    }

    public String getMaterialCarroceria() {
        return materialCarroceria;
    }
    
}
