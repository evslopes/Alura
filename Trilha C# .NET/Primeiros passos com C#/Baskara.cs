

using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApplication1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int a = 2;
            int b = 5;
            int c = 7;
            int delta = 0;
            double a1 = 915.59;
            double a2 = 955.57;

            delta = b * b - 4 * a * c;
            a1 = (-b + Math.Sqrt(delta)) / (2 * a);
            a2 = (-b - Math.Sqrt(delta)) / (2 * a);


            MessageBox.Show("O valor de a1 é:" + a1);
            MessageBox.Show("O valor de a2 é:" + a2);
        }
    }
}

