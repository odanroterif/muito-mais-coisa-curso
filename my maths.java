//para começar a usar basta criar um package e uma class de mesmo nome, depois disso é só copiar colar e usar 
package mathhelpers;


public class mathfunctions 
{
    int i;
    float float_result = 0;
    int int_result = 0;    
    
    
    //potencia de um número real
    public float potence_floatmath(float a,int b)
    {        
        for (i = 1; i <= b; i++) 
        {   
            if (float_result == 0) 
            {
                float_result = a;
            }
            else
            {
                float_result = float_result * a;
            }            
        }
        return float_result;
    }
    
    //potencia de um número inteiro
    public int potence_intmath(int a,int b)
    {        
        for (i = 1; i <= b; i++) 
        {   
            if (int_result == 0) 
            {
                int_result = a;
            }
            else
            {
                int_result = int_result * a;
            }            
        }
        return int_result;
    }
    
    //porcento de um número inteiro a partir de um % também inteiro
    public float percent_intmath(int a,int b)
    {        
        float_result = 0;
        
        if (float_result == 0)
        {
            float_result =  a * (b/100f);
        }        
        float_result =  Math.round(float_result * 100.0f) / 100.0f;
        
        return float_result;
    }
    
    //porcento de um número real a partir de um % inteiro
    public float percent_floatmath(float a,int b)
    {        
        float_result = 0;
        
        if (float_result == 0)
        {
            float_result =  a * (b/100f);
        }        
        float_result =  Math.round(float_result * 100.0f) / 100.0f;
        
        return float_result;
    }
    
    
    //porcento de um número inteiro a partir de um % real
    public float percent_intmathB(int a,float b)
    {        
        float_result = 0;
        
        if (float_result == 0)
        {
            float_result =  a * (b/100f);
        }        
        float_result =  Math.round(float_result * 100.0f) / 100.0f;
        
        return float_result;
    }
    
    
    //porcento de um número real a partir de um % também real
    public float percent_floatmathB(float a,float b)
    {        
        float_result = 0;
        
        if (float_result == 0)
        {
            float_result =  a * (b/100f);
        }        
        float_result =  Math.round(float_result * 100.0f) / 100.0f;
        
        return float_result;
    }
}
